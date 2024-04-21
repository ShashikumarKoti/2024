package com.skoti.learning.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionController {

	@ExceptionHandler
	public ResponseEntity<Object> handleUserNotFoundException(NoSuchUserFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<Object> handleAPIException(APIException apiException) {
		return new ResponseEntity<>(apiException.getErrors(),apiException.getHttpStatusCode());
	}
}

