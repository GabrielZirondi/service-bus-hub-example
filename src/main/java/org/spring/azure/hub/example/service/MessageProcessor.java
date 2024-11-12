package org.spring.azure.hub.example.service;

import lombok.extern.slf4j.Slf4j;
import org.spring.azure.hub.example.model.MalwareScanResult;
import org.springframework.stereotype.Service;

public @Service @Slf4j class MessageProcessor {

    public void process(MalwareScanResult result) {
        log.debug("Processing MalwareScanResult: {}", result);
    }
}