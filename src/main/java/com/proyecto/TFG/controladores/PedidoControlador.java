package com.proyecto.TFG.controladores;

import com.proyecto.TFG.modelos.Pedido;
import com.proyecto.TFG.servicios.PedidoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoControlador {

    @Autowired
    PedidoServicioImpl pedidoServicio;

    @GetMapping("/listar")
    public List<Pedido> obtenerPedidos(){
        return pedidoServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Pedido> guardarPedido(@RequestBody Pedido pedido){
        pedidoServicio.guardar(pedido);
        return new ResponseEntity<>(pedido, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> obtenerPedido(@PathVariable long id){
        Pedido pedidoId = pedidoServicio.obtenerPorId(id);
        return ResponseEntity.ok(pedidoId);
    }

    //implementar update

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarPedido(@PathVariable long id){
        this.pedidoServicio.eliminar(id);

        HashMap<String, Boolean> estadoPedidoEliminado = new HashMap<>();
        estadoPedidoEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoPedidoEliminado);
    }

}
