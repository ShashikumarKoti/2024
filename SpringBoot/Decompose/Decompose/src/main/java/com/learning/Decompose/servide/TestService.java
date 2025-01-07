package com.learning.Decompose.servide;



import com.example.common.config.ErrorDetail;
import com.example.common.config.ErrorDetails;
import com.example.common.config.ServiceError;
import com.example.common.config.ServiceException;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  public List<String> getApplications() {
    return Arrays.asList("AED12345", "LM12345");
  }

  public List<String> getApplicationsWithExp() {
    ErrorDetail errorDetail = new ErrorDetail(HttpStatus.BAD_GATEWAY, "Invalid length");
    ErrorDetails errorDetails = new ErrorDetails(Arrays.asList(errorDetail));
      if(Arrays.asList("1111", "2222").size() < 3) throw new ServiceException(ServiceError.MISSING_FIELDS, errorDetails);
    return Arrays.asList("1111", "2222");
  }
}
