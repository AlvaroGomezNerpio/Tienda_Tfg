package com.proyecto.TFG.servicios;



import com.proyecto.TFG.modelos.Producto;

import java.util.List;

public interface IProductoServicio {

    public List<Producto> obtenerTodo();

    public Producto guardar(Producto producto);

    public Producto obtenerPorId(long id);

    public void eliminar(long id);

}
