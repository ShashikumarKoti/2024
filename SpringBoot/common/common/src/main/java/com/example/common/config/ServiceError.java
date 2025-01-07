package com.example.common.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ServiceError implements ErrorType {

    GEN802(HttpStatus.BAD_GATEWAY, "Request header is incorrect"),

    GEN803(HttpStatus.BAD_REQUEST, "Fields are missing");

    public static final String INVALID_PAYLOAD = "GEN0802";

    public static final String MISSING_FIELDS = "GEN0803";

    private HttpStatus errorCode;

    private String errorDesc;
}
