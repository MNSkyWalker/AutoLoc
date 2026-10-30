package tn.esprit.autoloc.domain.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> badRequest(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(Map.of("erreur", e.getMessage()));
    }

    // in GlobalExceptionHandler
    @ExceptionHandler(VehiculeIntrouvableException.class)
    public ResponseEntity<Map<String, String>> notFound(VehiculeIntrouvableException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("erreur", e.getMessage()));
    }
}