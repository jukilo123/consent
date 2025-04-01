package com.dimagox.consentimiento.infrastructure.kafka;

import com.dimagox.consentimiento.domain.Consentimiento;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ConsentimientoProducer {
    private final KafkaTemplate<String, Consentimiento> kafkaTemplate;

    public ConsentimientoProducer(KafkaTemplate<String, Consentimiento> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendConsentEvent(Consentimiento consent) {
        kafkaTemplate.send("consent-topic", consent);
        System.out.println("✅ Evento enviado: " + consent);
    }
}
