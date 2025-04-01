package com.dimagox.consentimiento.infrastructure.persistence;

import com.dimagox.consentimiento.domain.Consentimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsentimientoRepository extends JpaRepository<Consentimiento, String> {
}
