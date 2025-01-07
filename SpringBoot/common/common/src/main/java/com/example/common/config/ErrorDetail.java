package com.example.common.config;

import lombok.*;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ErrorDetail {

    private HttpStatus errorCode;

    private String errorDesc;

}
