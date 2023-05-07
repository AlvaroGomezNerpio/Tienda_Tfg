package com.proyecto.TFG.dtos;

import com.proyecto.TFG.modelos.Direccion;
import com.proyecto.TFG.modelos.Factura;
import com.proyecto.TFG.modelos.FormaPagoUsuario;
import com.proyecto.TFG.modelos.Pedido;
import com.proyecto.TFG.modelos.Rol;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

public class UsuarioDTO{

    private long Id;
    private String nombre;
    private String email;
    private String telefono;
    private String contraseña;
    private RolDTO rol;
    private List<FacturaDTO> facturas;
    private List<DireccionDTO> direcciones;
    private List<FormaPagoUsuarioDTO> formasPagosUsuario;
    private List<PedidoDTO> pedidos;

    public UsuarioDTO(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public RolDTO getRol() {
        return rol;
    }

    public void setRol(RolDTO rol) {
        this.rol = rol;
    }

    public List<FacturaDTO> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<FacturaDTO> facturas) {
        this.facturas = facturas;
    }

    public List<DireccionDTO> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<DireccionDTO> direcciones) {
        this.direcciones = direcciones;
    }

    public List<FormaPagoUsuarioDTO> getFormasPagosUsuario() {
        return formasPagosUsuario;
    }

    public void setFormasPagosUsuario(List<FormaPagoUsuarioDTO> formasPagosUsuario) {
        this.formasPagosUsuario = formasPagosUsuario;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }
}
