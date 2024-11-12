package org.spring.azure.hub.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Data
public class Data {

    private String correlationId;
    @JsonProperty("eTag")
    private String eTag;
    private String scanFinishedTimeUtc;
    private String scanResultType;
    private ScanResultDetails scanResultDetails;
    private String blobUri;

}