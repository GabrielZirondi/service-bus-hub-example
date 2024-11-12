package org.spring.azure.hub.example.model;

import lombok.Data;

import java.util.List;

@Data
public class ScanResultDetails {

    private List<String> malwareNamesFound;
    private String sha256;

}