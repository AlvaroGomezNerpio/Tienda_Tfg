package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.FormaPago;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagoServicioImpl implements IFormaPagoServicio{
    @Override
    public List<FormaPago> obtenerTodo() {
        return null;
    }

    @Override
    public FormaPago guardar(FormaPago formaPago) {
        return null;
    }

    @Override
    public FormaPago obtenerPorId(long id) {
        return null;
    }

    @Override
    public void eliminar(long id) {

    }
}
