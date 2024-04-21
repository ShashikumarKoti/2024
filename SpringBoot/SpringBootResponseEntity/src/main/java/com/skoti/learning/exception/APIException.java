package com.skoti.learning.exception;

import java.util.Set;

import org.springframework.http.HttpStatus;

import com.skoti.learning.constants.APIErrors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class APIException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Set<APIErrors> errors;
	private HttpStatus httpStatusCode;

	public APIException(HttpStatus httpStatusCode, Set<APIErrors> errors) {
		this.httpStatusCode = httpStatusCode;
		this.errors = errors;
	}

}
