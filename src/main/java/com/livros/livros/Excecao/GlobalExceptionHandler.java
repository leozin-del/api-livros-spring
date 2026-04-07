package com.livros.livros.Excecao;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RecursoNaoEncontradoExcecao.class)
    public ResponseEntity<String> handleNotFound(RecursoNaoEncontradoExcecao ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }
}
