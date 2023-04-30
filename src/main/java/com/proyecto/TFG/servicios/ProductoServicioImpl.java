package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Producto;
import com.proyecto.TFG.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl  implements IProductoServicio{

    @Autowired
    ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> obtenerTodo() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto guardar(Producto producto) {
        return productoRepositorio.save(producto);
    }

    @Override
    public Producto obtenerPorId(long id) {
        return productoRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        productoRepositorio.deleteById(id);
    }
}
