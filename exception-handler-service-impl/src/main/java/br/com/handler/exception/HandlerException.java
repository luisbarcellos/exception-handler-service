package br.com.handler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class HandlerException extends Error {
    public HandlerException(String message) {
        super(message);
    }
}