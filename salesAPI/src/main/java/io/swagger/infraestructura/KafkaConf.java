package io.swagger.infraestructura;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConf {

    @Value("${kafka.bootstrap-server}")
    private String bootstrapServer;

    @Value("${kafka.properties.security.protocol}")
    private String securityProtocol;

    @Value("${kafka.properties.sasl.mechanism}")
    private String saslMechanism;

    @Value("${kafka.properties.sasl.jaas.config}")
    private String jaasConfig;

    @Bean
    public ProducerFactory<String, String> customProducerFactory() {
        Map<String, Object> properties = new HashMap<>();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        properties.put(ProducerConfig.ACKS_CONFIG, "1");
        properties.put(ProducerConfig.RETRIES_CONFIG, "3");
        properties.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, securityProtocol);
        properties.put(SaslConfigs.SASL_MECHANISM, saslMechanism);
        properties.put(SaslConfigs.SASL_JAAS_CONFIG, jaasConfig);
        return new DefaultKafkaProducerFactory<>(properties);
    }

    @Bean
    public KafkaTemplate<String, String> customKafkaTemplate(ProducerFactory<String, String> customProducerFactory) {
        return new KafkaTemplate<>(customProducerFactory);
    }

    @Bean
    public KafkaSender sender() {
        return new KafkaSender();
    }
}
