package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Pedido;
import com.proyecto.TFG.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServicioImpl implements  IPedidoServicio{

    @Autowired
    PedidoRepositorio pedidoRepositorio;

    @Override
    public List<Pedido> obtenerTodo() {
        return pedidoRepositorio.findAll();
    }

    @Override
    public Pedido guardar(Pedido pedido) {
        return pedidoRepositorio.save(pedido);
    }

    @Override
    public Pedido obtenerPorId(long id) {
        return pedidoRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        pedidoRepositorio.deleteById(id);
    }
}
