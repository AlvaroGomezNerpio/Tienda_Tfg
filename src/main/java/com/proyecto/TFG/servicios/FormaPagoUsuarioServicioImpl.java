package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.FormaPago;
import com.proyecto.TFG.modelos.FormaPagoUsuario;
import com.proyecto.TFG.repositorios.FormaPagoUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagoUsuarioServicioImpl implements IFormaPagoUsuarioServicio{

    @Autowired
    FormaPagoUsuarioRepositorio formaPagoUsuarioRepositorio;

    @Override
    public List<FormaPagoUsuario> obtenerTodo() {
        return formaPagoUsuarioRepositorio.findAll();
    }

    @Override
    public FormaPagoUsuario guardar(FormaPagoUsuario formaPagoUsuario) {
        return formaPagoUsuarioRepositorio.save(formaPagoUsuario);
    }

    @Override
    public FormaPagoUsuario obtenerPorId(long id) {
        return formaPagoUsuarioRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        formaPagoUsuarioRepositorio.deleteById(id);
    }
}
