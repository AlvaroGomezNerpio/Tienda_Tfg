package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Factura;
import com.proyecto.TFG.repositorios.FacturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServicioImpl implements IFacturaServicio{

    @Autowired
    FacturaRepositorio facturaRepositorio;

    @Override
    public List<Factura> obtenerTodo() {
        return facturaRepositorio.findAll();
    }

    @Override
    public Factura guardar(Factura factura) {
        return facturaRepositorio.save(factura);
    }

    @Override
    public Factura obtenerPorId(long id) {
        return facturaRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        facturaRepositorio.deleteById(id);
    }
}
