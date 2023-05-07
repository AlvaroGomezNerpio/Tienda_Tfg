package com.proyecto.TFG.controladores;


import com.proyecto.TFG.modelos.LineaPedido;
import com.proyecto.TFG.servicios.LineaPedidoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/lineaPedido")
public class LineaPedidoControlador {

    @Autowired
    LineaPedidoServicioImpl lineaPedidoServicio;

    @GetMapping("listar")
    public List<LineaPedido> obtenerLineasPedido(){
        return lineaPedidoServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<LineaPedido> guardarLineaPedido(@RequestBody LineaPedido lineaPedido){
        lineaPedidoServicio.guardar(lineaPedido);
        return new ResponseEntity<>(lineaPedido, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LineaPedido> obtenerLineaPedido(@PathVariable long id){
        LineaPedido lineaPedidoId = lineaPedidoServicio.obtenerPorId(id);

        return ResponseEntity.ok(lineaPedidoId);
    }

    //implementar update

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarLineaPedido(@PathVariable long id){
        this.lineaPedidoServicio.eliminar(id);

        HashMap<String, Boolean> estadoLineaPedidoEliminado = new HashMap<>();
        estadoLineaPedidoEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoLineaPedidoEliminado);
    }

}
