package com.example.common.config;

import lombok.Getter;

@Getter
public class ServiceException extends RuntimeException{

    private ErrorDetails errorDetails;

    public ServiceException(final String errorMessage) {
        super(errorMessage);
    }

    public ServiceException(final String errorMessage, final ErrorDetails errorDetails) {
        super(errorMessage);
        this.errorDetails = errorDetails;
    }
}
