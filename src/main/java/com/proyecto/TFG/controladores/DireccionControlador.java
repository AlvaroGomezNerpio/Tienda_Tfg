package com.proyecto.TFG.controladores;

import com.proyecto.TFG.modelos.Direccion;
import com.proyecto.TFG.modelos.Rol;
import com.proyecto.TFG.modelos.Usuario;
import com.proyecto.TFG.servicios.DireccionServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/direccion")
public class DireccionControlador {

    @Autowired
    DireccionServicioImpl direccionServicio;

    @GetMapping("/listar")
    public List<Direccion> obtenerDirecciones(){
        return direccionServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Direccion> guardarDireccion(@RequestBody Direccion direccion){
        direccionServicio.guardar(direccion);
        return new ResponseEntity<>(direccion, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Direccion> obtenerDireccion(@PathVariable long id){
        Direccion direccionId = direccionServicio.obtenerPorId(id);

        return ResponseEntity.ok(direccionId);
    }

    @PutMapping("{id}")
    public ResponseEntity<Direccion> actualizarDireccion(@PathVariable long id, @RequestBody Direccion direccion){
        Direccion direccionId = direccionServicio.obtenerPorId(id);
        direccionId.setCiudad(direccion.getCiudad());
        direccionId.setDireccion(direccion.getDireccion());

        Direccion direccionAct = direccionServicio.guardar(direccionId);
        return new ResponseEntity<>(direccionAct, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarDireccion(@PathVariable long id){
        this.direccionServicio.eliminar(id);

        HashMap<String, Boolean> estadoDireccionEliminado = new HashMap<>();
        estadoDireccionEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoDireccionEliminado);
    }

}
