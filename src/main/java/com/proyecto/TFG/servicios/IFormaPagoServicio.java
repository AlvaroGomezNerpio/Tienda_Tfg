package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.FormaPago;

import java.util.List;

public interface IFormaPagoServicio {

    public List<FormaPago> obtenerTodo();

    public FormaPago guardar(FormaPago formaPago);

    public FormaPago obtenerPorId(long id);

    public void eliminar(long id);

}
