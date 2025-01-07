package com.skoti.learning.interceptors;

import com.skoti.learning.exception.APIErrors;
import com.skoti.learning.exception.APIException;
import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Component
public class TInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("preHandle() of TestInterceptor");
        String userId = request.getHeader("USERID");
        String country = request.getHeader("COUNTRY");
        validateHeaders(userId, country);
        return true;
    }

        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                            @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle() of TestInterceptor");
    }

        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, //
                                Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion() of TestInterceptor");
    }

        private void validateHeaders(String userId, String country) {
        Set<APIErrors> errors = new HashSet<>();
        if (Objects.isNull(userId) || userId.isEmpty()) {
            errors.add(new APIErrors("INVALID_USER_ID", "UserId cannot be empty from TestInterceptor"));
        }

        if (Objects.isNull(country) || country.isEmpty()) {
            errors.add(new APIErrors("INVALID_COUNTRY", "Country cannot be empty from TestInterceptor"));
        }

        if (errors.size() > 0) {
            throw new APIException(HttpStatus.FORBIDDEN, errors);
        }
    }

}
