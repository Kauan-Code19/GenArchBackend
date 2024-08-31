package com.kauanProjects.GenArch.dtos.collections.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FieldMessageErrorDto {

    private String fieldName; // Name of the field that caused the error
    private String message; // Error message related to the field

}
