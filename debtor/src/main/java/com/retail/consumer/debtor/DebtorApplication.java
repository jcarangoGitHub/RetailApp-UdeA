package com.retail.consumer.debtor;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Properties;

@SpringBootApplication
public class DebtorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebtorApplication.class, args);

		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", "omnibus-01.srvs.cloudkafka.com:9094,omnibus-02.srvs.cloudkafka.com:9094,omnibus-03.srvs.cloudkafka.com:9094");
		properties.setProperty("key.deserializer", StringDeserializer.class.getName());
		properties.setProperty("value.deserializer", StringDeserializer.class.getName());
		properties.setProperty("auto.offset.reset", "earliest");
		properties.setProperty("enable.auto.commit", "true");
		properties.setProperty("group.id", "appdebtor");
		properties.setProperty("security.protocol", "SASL_SSL");
		properties.setProperty("sasl.mechanism", "SCRAM-SHA-256");
		properties.setProperty("sasl.jaas.config", "org.apache.kafka.common.security.scram.ScramLoginModule required username=aubde8gv password=n6xHengBTGpTPDmoMqPQ--i7boFA8b3l;");

		KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);
		kafkaConsumer.subscribe(Arrays.asList("aubde8gv-ventas", "aubde8gv-devoluciones"));

		while(true) {
			ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(100L);
			for(ConsumerRecord record : consumerRecords) {
				System.out.format("Partición: %d, Offset: %d, Value: %s, Tópico: %s%n", record.partition(),
						record.offset(), record.value(), record.topic());
			}
		}

	}
}
