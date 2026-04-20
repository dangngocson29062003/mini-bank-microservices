package com.sondang.loans.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNT_MS");
    }
}
