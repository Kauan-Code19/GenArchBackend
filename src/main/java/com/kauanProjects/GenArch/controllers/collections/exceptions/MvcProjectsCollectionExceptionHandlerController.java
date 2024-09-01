package com.kauanProjects.GenArch.controllers.collections.exceptions;

import com.kauanProjects.GenArch.dtos.collections.exceptions.CustomErrorDto;
import com.kauanProjects.GenArch.dtos.collections.exceptions.ValidationErrorDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.Instant;

@ControllerAdvice
public class MvcProjectsCollectionExceptionHandlerController {

    /**
     * Handles MethodArgumentNotValidException for validation errors.
     *
     * @param exception the exception thrown during method argument validation
     * @param request the HttpServletRequest for the current request
     * @return a ResponseEntity containing the validation error details
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CustomErrorDto> methodArgumentNotValidation(MethodArgumentNotValidException exception,
                                                                      HttpServletRequest request) {
        HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY; // HTTP status for unprocessable entity

        // Create a ValidationErrorDto with current timestamp, status, message, and request URI
        ValidationErrorDto validationErrorDto = new ValidationErrorDto(
                Instant.now(),
                status.value(),
                "Dados Inválidos",
                request.getRequestURI()
        );

        // Loop through field errors and add them to the ValidationErrorDto
        for (FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
            validationErrorDto.addError(fieldError.getField(), fieldError.getDefaultMessage());
        }

        // Return the response entity with the validation error details
        return ResponseEntity.status(status).body(validationErrorDto);
    }
}
