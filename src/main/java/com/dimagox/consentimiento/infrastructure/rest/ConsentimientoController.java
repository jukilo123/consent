package com.dimagox.consentimiento.infrastructure.rest;

import com.dimagox.consentimiento.application.ConsentimientoService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/consent")
public class ConsentimientoController {
    
    private final ConsentimientoService consentService;

    public ConsentimientoController(ConsentimientoService consentService) {
        this.consentService = consentService;
    }

    @PostMapping("/send")
    public String sendConsent(@RequestParam String userId, @RequestParam String documentId) {
        consentService.processConsent(userId, documentId);
        return "✅ Consentimiento enviado para " + userId;
    }
}
