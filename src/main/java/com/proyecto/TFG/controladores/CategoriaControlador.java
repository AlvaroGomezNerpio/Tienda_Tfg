package com.proyecto.TFG.controladores;

import com.proyecto.TFG.modelos.Categoria;
import com.proyecto.TFG.servicios.CategoriaServicioImpl;
import com.proyecto.TFG.servicios.MarcaServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {

    @Autowired
    CategoriaServicioImpl categoriaServicio;

    @GetMapping("listar")
    public List<Categoria> obtenerCategorias(){
        return categoriaServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Categoria> guardarCategoria(@RequestBody Categoria categoria){
        categoriaServicio.guardar(categoria);
        return new ResponseEntity<>(categoria, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> obtenerCategoria(@PathVariable long id){
        Categoria categoriaId = categoriaServicio.obtenerPorId(id);

        return ResponseEntity.ok(categoriaId);
    }

    //implementar update

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarCategoria(@PathVariable long id){
        this.categoriaServicio.eliminar(id);

        HashMap<String, Boolean> estadoMarcaEliminado = new HashMap<>();
        estadoMarcaEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoMarcaEliminado);
    }

}
