package com.proyecto.TFG.controladores;

import com.proyecto.TFG.modelos.Factura;
import com.proyecto.TFG.servicios.FacturaServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaControlador {

    @Autowired
    FacturaServicioImpl facturaServicio;

    @GetMapping("/listar")
    public List<Factura> obtenerFacturas(){
        return facturaServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Factura> guardarFactura(@RequestBody Factura factura){
        facturaServicio.guardar(factura);
        return new ResponseEntity<>(factura, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> obtenerFactura(@PathVariable long id){
        Factura facturaId = facturaServicio.obtenerPorId(id);

        return ResponseEntity.ok(facturaId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Factura> actualizarFactura(@PathVariable long id, @RequestBody Factura factura){

        Factura facturaAtc = facturaServicio.guardar(factura);
        return new ResponseEntity<>(facturaAtc, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarFactura(@PathVariable long id){
        this.facturaServicio.eliminar(id);

        HashMap<String, Boolean> estadoFacturaEliminado = new HashMap<>();
        estadoFacturaEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoFacturaEliminado);
    }

}
