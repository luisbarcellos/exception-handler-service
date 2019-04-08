package br.com.handler;

import br.com.handler.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exception")
public class Controller {
    @Autowired
    private Service service;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void helloIntegracao() {
        service.getException();
    }
}