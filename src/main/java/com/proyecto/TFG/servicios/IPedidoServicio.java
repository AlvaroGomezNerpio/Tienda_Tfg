package com.proyecto.TFG.servicios;



import com.proyecto.TFG.modelos.Pedido;

import java.util.List;

public interface IPedidoServicio {

    public List<Pedido> obtenerTodo();

    public Pedido guardar(Pedido pedido);

    public Pedido obtenerPorId(long id);

    public void eliminar(long id);

}
