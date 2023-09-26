package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Libro;
import com.example.services.LibrosService;

@RestController
public class LibrosController {
    
    @Autowired
    LibrosService service;

    @GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> libros(){
        return service.libros();
    }

    @GetMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro libros(@PathVariable("isbn") int isbn){
        return service.buscaLibro(isbn);
    }

    @PostMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregar(@RequestBody Libro libro){
        service.altaLibro(libro);
    }

    @PutMapping(value="libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@RequestBody Libro libro){
        service.actualizarLibro(libro);
    }

    @DeleteMapping(value="libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> eliminar(@PathVariable("isbn")int isbn){
        return service.eliminarLibro(isbn);
    }
}
