package com.example.common.config;

import static org.springframework.http.HttpStatus.GATEWAY_TIMEOUT;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

   @Autowired(required = true)
    private ErrorConstructor errorConstructor;

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<ErrorDetails> serviceException(final ServiceException serviceException) {
        ErrorDetails errorDetails = serviceException.getErrorDetails();
        System.out.println("serviceExp: " + serviceException.getMessage());
        if (Optional.ofNullable(errorDetails).isEmpty())
            errorDetails = errorConstructor.constructResponse(ServiceError.GEN802);
        System.out.println("errorDetailsList " + errorDetails.getErrorDetailList());
        return new ResponseEntity<>(errorDetails, GATEWAY_TIMEOUT);
    }

}
