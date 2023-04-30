package com.proyecto.TFG.servicios;



import com.proyecto.TFG.modelos.Ejemplar;

import java.util.List;

public interface IEjemplarServicio {

    public List<Ejemplar> obtenerTodo();

    public Ejemplar guardar(Ejemplar ejemplar);

    public Ejemplar obtenerPorId(long id);

    public void eliminar(long id);

}
