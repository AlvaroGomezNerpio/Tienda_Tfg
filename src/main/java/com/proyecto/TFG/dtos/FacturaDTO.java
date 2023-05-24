package com.proyecto.TFG.dtos;

import com.proyecto.TFG.modelos.Direccion;
import com.proyecto.TFG.modelos.LineaFactura;
import com.proyecto.TFG.modelos.LineaPedido;
import com.proyecto.TFG.modelos.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO{

    private long id;
    private String observaciones;
    private LocalDate fecha;
    private UsuarioDTOL usuario;
    private DireccionDTOL direccion;

}
