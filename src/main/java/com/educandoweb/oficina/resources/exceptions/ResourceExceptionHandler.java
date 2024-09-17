package com.educandoweb.oficina.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educandoweb.oficina.services.exceptions.DatabaseException;
import com.educandoweb.oficina.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String error = "Recurso não encontrado.";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(error, e.getMessage(), request.getRequestURI(), status.value(), Instant.now());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
        String error = "Erro no banco de dados.";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(error, e.getMessage(), request.getRequestURI(), status.value(), Instant.now());

        return ResponseEntity.status(status).body(err);
    }
}
