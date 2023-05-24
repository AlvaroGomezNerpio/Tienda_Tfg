package com.proyecto.TFG.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EjemplarDTO{

    private long Id;
    private String serie;
    private Date fechaVenta;
    private Date fechaCompra;
    private int unidades;
    private ProductoDTOL producto;

}
