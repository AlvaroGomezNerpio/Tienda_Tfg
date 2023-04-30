package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Categoria;

import java.util.List;

public interface ICategoriaServicio {

    public List<Categoria> obtenerTodo();

    public Categoria guardar(Categoria categoria);

    public Categoria obtenerPorId(long id);

    public void eliminar(long id);

}
