package com.springboot.myapp.springRest.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarErrorResponse {
    private String status;
    private String message;
    private long time;

}
