package com.proyecto.TFG.controladores;

import com.proyecto.TFG.modelos.Usuario;
import com.proyecto.TFG.servicios.UsuarioServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {

    @Autowired
    UsuarioServicioImpl usuarioServicio;

    @GetMapping("/listar")
    public List<Usuario> obtenerUsuarios(){
        return usuarioServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario){
        usuarioServicio.guardar(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable long id){
        Usuario clienteId = usuarioServicio.obtenerPorId(id);

        return ResponseEntity.ok(clienteId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable long id, @RequestBody Usuario usuario){
        usuarioServicio.guardar(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarUsuario(@PathVariable long id){
        this.usuarioServicio.eliminar(id);

        HashMap<String, Boolean> estadoUsuarioEliminado = new HashMap<>();
        estadoUsuarioEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoUsuarioEliminado);
    }

}
