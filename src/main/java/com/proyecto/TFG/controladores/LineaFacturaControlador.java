package com.proyecto.TFG.controladores;


import com.proyecto.TFG.modelos.LineaFactura;
import com.proyecto.TFG.servicios.LineaFacturaServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/lineaFactura")
public class LineaFacturaControlador {

    @Autowired
    private LineaFacturaServicioImpl lineaFacturaService;

    @GetMapping("listar")
    public List<LineaFactura> obtenerLineasFactura(){
        return lineaFacturaService.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<LineaFactura> guardarLineaFactura(@RequestBody LineaFactura lineaFactura){
        lineaFacturaService.guardar(lineaFactura);
        return new ResponseEntity<>(lineaFactura, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LineaFactura> obtenerlineaFactura(@PathVariable long id){
        LineaFactura lineaFacturaId = lineaFacturaService.obtenerPorId(id);

        return ResponseEntity.ok(lineaFacturaId);
    }

    //implementar update

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarlineaFactura(@PathVariable long id){
        this.lineaFacturaService.eliminar(id);

        HashMap<String, Boolean> estadoLineaFacturaEliminado = new HashMap<>();
        estadoLineaFacturaEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoLineaFacturaEliminado);
    }

}
