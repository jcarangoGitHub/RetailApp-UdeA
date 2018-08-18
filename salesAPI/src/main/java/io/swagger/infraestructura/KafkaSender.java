package io.swagger.infraestructura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaSender {

    @Autowired
    private KafkaTemplate<String, String> customKafkaTemplate;

    public void enviarMensaje(String topic, String payload) {
        customKafkaTemplate.send(topic, payload);
    }
}
