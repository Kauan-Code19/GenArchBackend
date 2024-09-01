package com.kauanProjects.GenArch.dtos.collections.exceptions;

import lombok.Getter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
public class ValidationErrorDto extends CustomErrorDto{

    private final List<FieldMessageErrorDto> errors = new ArrayList<>(); // List of field errors

    /**
     * Constructs a ValidationErrorDto with the specified parameters.
     *
     * @param timestamp the timestamp of the error
     * @param status the HTTP status code
     * @param message the error message
     * @param trace the URI of the request
     */
    public ValidationErrorDto(Instant timestamp, Integer status, String message, String trace) {
        super(timestamp, status, message, trace); // Call to the superclass constructor
    }

    /**
     * Adds an error to the list of field errors.
     *
     * @param fieldName the name of the field that caused the error
     * @param message the error message related to the field
     */
    public void addError(String fieldName, String message) {
        errors.add(new FieldMessageErrorDto(fieldName, message));
    }

}
