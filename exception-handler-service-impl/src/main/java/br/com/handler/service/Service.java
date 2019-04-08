package br.com.handler.service;

import br.com.handler.exception.HandlerException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Service {
    public void getException() {
        throw new HandlerException("Testando Exception personalizada!");
    }
}