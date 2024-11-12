package org.spring.azure.hub.example.global.handlers;

import com.azure.messaging.servicebus.ServiceBusErrorContext;
import lombok.extern.slf4j.Slf4j;
import org.spring.azure.hub.annotation.GlobalDeadLetterHandler;
import org.spring.azure.hub.annotation.GlobalErrorHandler;
import org.spring.azure.hub.example.model.MalwareScanResult;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public @Component @Slf4j class ServiceBusGlobalHandler {

    @GlobalErrorHandler @Order(10)
    public void handleGlobalError(ServiceBusErrorContext errorContext) {
        log.error("Error processing message: '{}'. Exception: {}",
                errorContext.getEntityPath(), errorContext.getException());
    }

    @GlobalDeadLetterHandler @Order(10)
    public void handleGlobalDeadLetter(MalwareScanResult messageContext) {
        log.error("Receive message: {}", messageContext);
    }
}