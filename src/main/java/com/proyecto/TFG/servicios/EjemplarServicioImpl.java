package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Ejemplar;
import com.proyecto.TFG.repositorios.EjemplarRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjemplarServicioImpl implements IEjemplarServicio{

    @Autowired
    EjemplarRepositorio ejemplarRepositorio;

    @Override
    public List<Ejemplar> obtenerTodo() {
        return ejemplarRepositorio.findAll();
    }

    @Override
    public Ejemplar guardar(Ejemplar ejemplar) {
        return ejemplarRepositorio.save(ejemplar);
    }

    @Override
    public Ejemplar obtenerPorId(long id) {
        return ejemplarRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        ejemplarRepositorio.deleteById(id);
    }

}
