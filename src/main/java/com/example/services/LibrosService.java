package com.example.services;

import com.example.model.Libro;
import java.util.List;

public interface LibrosService {
    List<Libro> libros();
    Libro buscaLibro(int isbn);
    void altaLibro(Libro libro);
    void actualizarLibro(Libro lirbo);
    List<Libro> eliminarLibro(int isbn);

}
