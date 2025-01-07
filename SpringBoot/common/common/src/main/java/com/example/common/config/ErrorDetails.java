package com.example.common.config;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ErrorDetails {

    private List<ErrorDetail> errorDetailList;

    public ErrorDetails(final List<ErrorDetail> errorDetails) {
        this.errorDetailList = errorDetails;

    }
}
