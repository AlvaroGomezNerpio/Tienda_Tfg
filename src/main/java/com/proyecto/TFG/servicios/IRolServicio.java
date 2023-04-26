package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Rol;

import java.util.List;

public interface IRolServicio {

    public List<Rol> obtenerTodo();

    public Rol guardar(Rol rol);

    public Rol obtenerPorId(long id);

    public void eliminar(long id);

}
