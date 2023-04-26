package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Usuario;
import com.proyecto.TFG.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioImpl implements IUsuarioServicio {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> obtenerTodo() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario obtenerPorId(long id) {
        return usuarioRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        usuarioRepositorio.deleteById(id);
    }
}
