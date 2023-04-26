package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Direccion;
import com.proyecto.TFG.repositorios.DireccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DireccionServicioImpl implements IDireccionServicio{

    @Autowired
    DireccionRepositorio direccionRepositorio;

    @Override
    public List<Direccion> obtenerTodo() {
        return direccionRepositorio.findAll();
    }

    @Override
    public Direccion guardar(Direccion direccion) {
        return direccionRepositorio.save(direccion);
    }

    @Override
    public Direccion obtenerPorId(long id) {
        return direccionRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        direccionRepositorio.deleteById(id);
    }
}
