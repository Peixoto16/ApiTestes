package com.israel.api.repository.exceptions;

import com.israel.api.services.exception.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceEcxeptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandarError>objectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
        StandarError error =
                new StandarError(LocalDateTime.now(), HttpStatus.NOT_FOUND.value(), ex.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
