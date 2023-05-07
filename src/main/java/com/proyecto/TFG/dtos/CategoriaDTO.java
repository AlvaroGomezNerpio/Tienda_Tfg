package com.proyecto.TFG.dtos;

import com.proyecto.TFG.modelos.Producto;

import java.util.List;

public class CategoriaDTO {

    private long id;
    private String nombre;
    private String descripcion;
    private List<ProductoDTO> productos;

    public CategoriaDTO(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ProductoDTO> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoDTO> productos) {
        this.productos = productos;
    }
}
