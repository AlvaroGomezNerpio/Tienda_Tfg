package com.proyecto.TFG.servicios;

import com.proyecto.TFG.modelos.Usuario;

import java.util.List;

public interface IUsuarioServicio {

    public List<Usuario> obtenerTodo();

    public Usuario guardar(Usuario usuario);

    public Usuario obtenerPorId(long id);

    public void eliminar(long id);

}
