package com.proyecto.TFG.controladores;

import com.proyecto.TFG.modelos.Rol;
import com.proyecto.TFG.servicios.RolServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolControlador {

    @Autowired
    public RolControlador(RolServicioImpl rolServicio) {
        this.rolServicio = rolServicio;
    }

    @Autowired
    RolServicioImpl rolServicio;

    @GetMapping("/listar")
    public List<Rol> obtenerRoles(){
        return rolServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Rol> guardarRol(@RequestBody Rol rol){
        Rol nuevo = rolServicio.guardar(rol);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rol> obtenerRol(@PathVariable long id){
        Rol rolId = rolServicio.obtenerPorId(id);

        return ResponseEntity.ok(rolId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rol> actualizarRol(@PathVariable long id, @RequestBody Rol cliente){
        Rol rolId = rolServicio.obtenerPorId(id);
        rolId.setRol(cliente.getRol());

        Rol rolAtc = rolServicio.guardar(rolId);
        return new ResponseEntity<>(rolAtc, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarRol(@PathVariable long id){
        this.rolServicio.eliminar(id);

        HashMap<String, Boolean> estadoRolEliminado = new HashMap<>();
        estadoRolEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoRolEliminado);
    }

}
