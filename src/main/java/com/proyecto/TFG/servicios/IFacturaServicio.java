package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Factura;

import java.util.List;

public interface IFacturaServicio {

    public List<Factura> obtenerTodo();

    public Factura guardar(Factura factura);

    public Factura obtenerPorId(long id);

    public void eliminar(long id);

}
