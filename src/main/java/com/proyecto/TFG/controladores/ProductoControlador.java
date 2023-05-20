package com.proyecto.TFG.controladores;

import com.proyecto.TFG.dtos.ProductoDTO;
import com.proyecto.TFG.modelos.Producto;
import com.proyecto.TFG.servicios.ProductoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoControlador {

    @Autowired
    ProductoServicioImpl productoServicio;

    @GetMapping("/listar")
    public List<ProductoDTO> obtenerProductos(){
        return productoServicio.obtenerTodo();
    }

    @GetMapping("/marca/{id}")
    public List<ProductoDTO> obtenerProductoByMarca(@PathVariable Long marcaId){
        return productoServicio.findByCategoriaId(marcaId);
    }

    @GetMapping("/categoria/{id}")
    public List<ProductoDTO> obtenerProductosByCategoria(@PathVariable Long categoriaId){
        return productoServicio.findByCategoriaId(categoriaId);
    }

    @GetMapping("/random/{num}")
    public List<ProductoDTO> obtenerProductosRamdon(int num){

        List<ProductoDTO> productosRandom = new ArrayList<>();
        List<ProductoDTO> productos = productoServicio.obtenerTodo();
        int numProductos = productos.size();

        for (int i = 0; i < num; i++) {

            Random random = new Random();
            int randomNumber = random.nextInt(numProductos+1);

            productosRandom.add(productos.get(randomNumber));

        }

        return productosRandom;

    }

    @GetMapping("/random/categoria/{id}/{num}")
    public List<ProductoDTO> obtenerProductosRamdonByCategoria(Long categoriaId, int num){

        List<ProductoDTO> productosRandom = new ArrayList<>();
        List<ProductoDTO> productos = productoServicio.findByCategoriaId(categoriaId);
        int numProductos = productos.size();

        for (int i = 0; i < num; i++) {

            Random random = new Random();
            int randomNumber = random.nextInt(numProductos+1);

            productosRandom.add(productos.get(randomNumber));

        }

        return productosRandom;

    }

    @GetMapping("/random/marca/{id}/{num}")
    public List<ProductoDTO> obtenerProductosRamdonByMarca(Long marcaId, int num){

        List<ProductoDTO> productosRandom = new ArrayList<>();
        List<ProductoDTO> productos = productoServicio.findByMarcaId(marcaId);
        int numProductos = productos.size();

        for (int i = 0; i < num; i++) {

            Random random = new Random();
            int randomNumber = random.nextInt(numProductos+1);

            productosRandom.add(productos.get(randomNumber));

        }

        return productosRandom;

    }

    @PostMapping("/guardar")
    public ResponseEntity<ProductoDTO> guardarProducto(@RequestBody ProductoDTO producto){
        productoServicio.guardar(producto);
        return new ResponseEntity<>(producto, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> obtenerProducto(@PathVariable long id){
        ProductoDTO productoId = productoServicio.obtenerPorId(id);
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
