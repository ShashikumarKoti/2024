package com.skoti.learning.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIErrors {

    private String code;
    private String message;
}
