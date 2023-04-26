package com.proyecto.TFG.servicios;


import com.proyecto.TFG.modelos.Direccion;

import java.util.List;

public interface IDireccionServicio {

    public List<Direccion> obtenerTodo();

    public Direccion guardar(Direccion direccion);

    public Direccion obtenerPorId(long id);

    public void eliminar(long id);

}
