package com.skoti.learning.config;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.skoti.learning.constants.APIErrors;
import com.skoti.learning.constants.Constant;
import com.skoti.learning.exception.APIException;

@Configuration
public class HeaderInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		String userId = request.getHeader(Constant.HEADER_USERID);
		String partnerId = request.getHeader(Constant.HEADER_PARTNERID);
		System.out.println("Inside interceptor");
		validateHeaders(userId, partnerId);

		return true;
	}

	private void validateHeaders(String userId, String partnerId) {
		Set<APIErrors> errors = new HashSet<>();
		System.out.println("Inside validate header:  "+ userId);
		if (Objects.isNull(userId) || userId == null || userId.isBlank() || userId.isEmpty()) {
			errors.add(new APIErrors("INVALID USER ID", "User Id cannot be empty"));
		}

		if(Objects.isNull(partnerId) || partnerId.isBlank() || partnerId.isEmpty()) {
			errors.add(new APIErrors("PARTNER ID", "Partner Id cannot be empty"));
		}

		if (errors.size() > 0) {
			throw new APIException(HttpStatus.FORBIDDEN, errors);
		}
	}

}
