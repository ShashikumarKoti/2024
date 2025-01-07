package com.example.common.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorConstructor {

    public ErrorDetails constructResponse(final ErrorType errorType) {
        return constructResponse(errorType.getErrorCode(), errorType.getErrorDesc());
    }

    public ErrorDetails constructResponse(final HttpStatus errorCode, final String errorDesc) {

        List<ErrorDetail> errors = new ArrayList<>();
        ErrorDetail errorDetail = new ErrorDetail();
        errorDetail.setErrorCode(errorCode);
        errorDetail.setErrorDesc(errorDesc);
        errors.add(errorDetail);
        return new ErrorDetails(errors);

    }
}
