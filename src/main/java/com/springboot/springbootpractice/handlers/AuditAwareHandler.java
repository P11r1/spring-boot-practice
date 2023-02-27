package com.springboot.springbootpractice.handlers;

import com.springboot.springbootpractice.utils.Constants;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * Custom handler to implement AuditorAware
 * @author Marko
 * @Date 27/02/2023
 */
public class AuditAwareHandler implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(Constants.Audit.DEFAULT_AUDITOR);
    }
}
