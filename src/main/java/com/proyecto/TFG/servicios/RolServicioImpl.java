package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Rol;
import com.proyecto.TFG.repositorios.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServicioImpl implements IRolServicio {

    @Autowired
    RolRepositorio rolRepositorio;

    @Override
    public List<Rol> obtenerTodo() {
        return rolRepositorio.findAll();
    }

    @Override
    public Rol guardar(Rol rol) {
        return rolRepositorio.save(rol);
    }

    @Override
    public Rol obtenerPorId(long id) {
        return rolRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        rolRepositorio.deleteById(id);
    }
}
