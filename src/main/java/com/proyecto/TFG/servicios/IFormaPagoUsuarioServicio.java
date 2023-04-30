package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.FormaPagoUsuario;

import java.util.List;

public interface IFormaPagoUsuarioServicio {

    public List<FormaPagoUsuario> obtenerTodo();

    public FormaPagoUsuario guardar(FormaPagoUsuario formaPagoUsuario);

    public FormaPagoUsuario obtenerPorId(long id);

    public void eliminar(long id);

}
