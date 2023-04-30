package com.proyecto.TFG.controladores;

import com.proyecto.TFG.modelos.Producto;
import com.proyecto.TFG.servicios.ProductoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoControlador {

    @Autowired
    ProductoServicioImpl productoServicio;

    @GetMapping("/listar")
    public List<Producto> obtenerProductos(){
        return productoServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Producto> guardarProducto(@RequestBody Producto producto){
        productoServicio.guardar(producto);
        return new ResponseEntity<>(producto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable long id){
        Producto productoId = productoServicio.obtenerPorId(id);
        return ResponseEntity.ok(productoId);
    }

    //implementar update

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarProducto(@PathVariable long id){
        this.productoServicio.eliminar(id);

        HashMap<String, Boolean> estadoProductoEliminado = new HashMap<>();
        estadoProductoEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoProductoEliminado);
    }

}
