package br.com.handler.handler;

import br.com.handler.exception.HandlerException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Arrays;

@RestControllerAdvice
public class CustomRestExceptionHandler{
    @ExceptionHandler(HandlerException.class)
    public ResponseEntity<ApiError> handlerException(HandlerException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ApiError.builder()
                        .timestamp(LocalDateTime.now())
                        .status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .message(e.getLocalizedMessage())
                        .errors(Arrays.asList())
                        .build());
    }
}