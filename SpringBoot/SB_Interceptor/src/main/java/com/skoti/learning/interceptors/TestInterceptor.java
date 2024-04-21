package com.skoti.learning.interceptors;

import com.skoti.learning.exception.APIErrors;
import com.skoti.learning.exception.APIException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
@Slf4j
public class TestInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws APIException {
        System.out.println("preHandle() of TestInterceptor");
        String userId = request.getHeader("USERID");
        String country = request.getHeader("COUNTRY");
        validateHeaders(userId, country);
        return true;
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, //
                                Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion() of TestInterceptor");
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                            @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle() of TestInterceptor");
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
            log.error("Error while validating headers from TestInterceptor");
            throw new APIException(HttpStatus.FORBIDDEN, errors);
        }
    }
}
