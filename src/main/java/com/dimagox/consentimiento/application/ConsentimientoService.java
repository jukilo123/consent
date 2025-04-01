package com.dimagox.consentimiento.application;

import com.dimagox.consentimiento.domain.Consentimiento;
import com.dimagox.consentimiento.infrastructure.kafka.ConsentimientoProducer;
import org.springframework.stereotype.Service;

@Service
public class ConsentimientoService {
    private final ConsentimientoProducer consentProducer;

    public ConsentimientoService(ConsentimientoProducer consentProducer) {
        this.consentProducer = consentProducer;
    }

    public void processConsent(String userId, String documentId) {
        Consentimiento consent = new Consentimiento(userId, documentId);
        
        consentProducer.sendConsentEvent(consent);
    }
}
