package com.example.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService{

    List<Libro> libros;
    public LibrosServiceImpl() {
        libros = new ArrayList<>();
        libros.add(new Libro(111,"Java 17", "Programacion"));
        libros.add(new Libro(222,"CSS", "Web"));
        libros.add(new Libro(333,"PHP", "Programacion"));
        libros.add(new Libro(444,"Windows", "Sistemas"));
        libros.add(new Libro(555,"Linux", "Sistemas"));
    }

    @Override
    public List<Libro> libros() {
        return libros;
    }

    @Override
    public Libro buscaLibro(int isbn) {
        Libro libroelegido=new Libro();
        for (Libro libro : libros) {
            if(libro.getIsbn() == isbn){
                libroelegido=libro;
            }
        }
        return libroelegido;
    }

    @Override
    public List<Libro> eliminarLibro(int isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn() == isbn) {
                libros.remove(i);
            }
        }
        return libros;
    }

    @Override
    public void altaLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) {
        for (Libro libroListado : libros) {
            if(libroListado.getIsbn()==libro.getIsbn()){
                libroListado.setTitulo(libro.getTitulo());
                libroListado.setTematica(libro.getTematica());
            }
        }        
    }
     
}
