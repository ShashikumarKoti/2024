package com.example.common.config;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public interface ErrorType extends Serializable {

    HttpStatus getErrorCode();

    String getErrorDesc();
}
