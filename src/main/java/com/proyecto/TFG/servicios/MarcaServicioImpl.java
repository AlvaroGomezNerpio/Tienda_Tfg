package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Marca;
import com.proyecto.TFG.repositorios.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServicioImpl implements IMarcaServicio{

    @Autowired
    MarcaRepositorio marcaRepositorio;

    @Override
    public List<Marca> obtenerTodo() {
        return marcaRepositorio.findAll();
    }

    @Override
    public Marca guardar(Marca marca) {
        return marcaRepositorio.save(marca);
    }

    @Override
    public Marca obtenerPorId(long id) {
        return marcaRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        marcaRepositorio.deleteById(id);
    }
}
