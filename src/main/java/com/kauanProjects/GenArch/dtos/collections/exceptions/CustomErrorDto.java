package com.kauanProjects.GenArch.dtos.collections.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.Instant;

@AllArgsConstructor
@Getter
public class CustomErrorDto {

    private Instant timestamp; // Timestamp of the error
    private Integer status; // HTTP status code
    private String message; // Error message
    private String trace; // URI of the request

}
