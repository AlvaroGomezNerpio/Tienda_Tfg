package com.proyecto.TFG.controladores;

import com.proyecto.TFG.modelos.FormaPago;
import com.proyecto.TFG.servicios.FormaPagoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/formaPago")
public class FormaPagoControlador {

    @Autowired
    FormaPagoServicioImpl formaPagoServicio;

    @GetMapping("/listar")
    public List<FormaPago> obtenerFormasPagos(){
        return formaPagoServicio.obtenerTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<FormaPago> guardarFormaPago(@RequestBody FormaPago formaPago){
        formaPagoServicio.guardar(formaPago);
        return  new ResponseEntity<>(formaPago, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormaPago> obtenerFormaPag(@PathVariable long id){
        FormaPago formaPagoId = formaPagoServicio.obtenerPorId(id);

        return ResponseEntity.ok(formaPagoId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FormaPago> actualizarFormaPago(@PathVariable long id, @RequestBody FormaPago formaPago){
        formaPagoServicio.guardar(formaPago);
        return new ResponseEntity<>(formaPago, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarFormaPago(@PathVariable long id){
        this.formaPagoServicio.eliminar(id);

        HashMap<String, Boolean> estadoFormaPagoEliminado = new HashMap<>();
        estadoFormaPagoEliminado.put("eliminado", true);
        return  ResponseEntity.ok(estadoFormaPagoEliminado);
    }

}
