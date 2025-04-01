package com.dimagox.consentimiento.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consentimientos")
public class Consentimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private String userId;
    private String documentId;
    private LocalDateTime timestamp;

    public Consentimiento(String userId, String documentId) {
        this.userId = userId;
        this.documentId = documentId;
        this.timestamp = LocalDateTime.now();
    }

    public String getUserId() { return userId; }
    public String getDocumentId() { return documentId; }
    public LocalDateTime getTimestamp() { return timestamp; }


}
