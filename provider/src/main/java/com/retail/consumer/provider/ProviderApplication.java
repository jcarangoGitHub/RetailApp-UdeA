package com.retail.consumer.provider;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
		
		Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "omnibus-01.srvs.cloudkafka.com:9094,omnibus-02.srvs.cloudkafka.com:9094,omnibus-03.srvs.cloudkafka.com:9094");
        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        properties.setProperty("value.deserializer", StringDeserializer.class.getName());
        properties.setProperty("auto.offset.reset", "earliest");
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("group.id", "appprovider");
        properties.setProperty("security.protocol", "SASL_SSL");
        properties.setProperty("sasl.mechanism", "SCRAM-SHA-256");
        properties.setProperty("sasl.jaas.config", "org.apache.kafka.common.security.scram.ScramLoginModule required username=aubde8gv password=n6xHengBTGpTPDmoMqPQ--i7boFA8b3l;");
		
		KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(properties);
		kafkaConsumer.subscribe(Arrays.asList("aubde8gv-ventas"));
		
		while(true) {
			ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(100);
			
			for(ConsumerRecord<String, String> consumerRecord: consumerRecords) {
				System.out.println("Partición: " + consumerRecord.partition() + 
						", offset: " + consumerRecord.offset() + 
						", Value: " + consumerRecord.value() +
						", Topico: " + consumerRecord.topic()
				);
			}
		}
	}
}
