package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Marca;

import java.util.List;

public interface IMarcaServicio {

    public List<Marca> obtenerTodo();

    public Marca guardar(Marca marca);

    public Marca obtenerPorId(long id);

    public void eliminar(long id);

}
