package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Categoria;
import com.proyecto.TFG.repositorios.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicioImpl implements ICategoriaServicio{

    @Autowired
    CategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Categoria> obtenerTodo() {
        return categoriaRepositorio.findAll();
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Categoria obtenerPorId(long id) {
        return categoriaRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        categoriaRepositorio.deleteById(id);
    }
}