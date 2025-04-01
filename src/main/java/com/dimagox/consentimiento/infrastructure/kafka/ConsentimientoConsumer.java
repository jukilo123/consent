package com.dimagox.consentimiento.infrastructure.kafka;

import com.dimagox.consentimiento.domain.Consentimiento;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsentimientoConsumer {
    @KafkaListener(topics = "consent-topic", groupId = "consent-group")
    public void listen(Consentimiento consent) {
        System.out.println("📩 Consentimiento recibido: " + consent);
    }
}
