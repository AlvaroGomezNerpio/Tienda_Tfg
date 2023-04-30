package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.FormaPago;
import com.proyecto.TFG.repositorios.FormaPagoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagoServicioImpl implements IFormaPagoServicio{

    @Autowired
    FormaPagoRepositorio formaPagoRepositorio;

    @Override
    public List<FormaPago> obtenerTodo() {
        return formaPagoRepositorio.findAll();
    }

    @Override
    public FormaPago guardar(FormaPago formaPago) {
        return formaPagoRepositorio.save(formaPago);
    }

    @Override
    public FormaPago obtenerPorId(long id) {
        return formaPagoRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        formaPagoRepositorio.deleteById(id);
    }
}
