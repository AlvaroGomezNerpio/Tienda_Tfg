package com.proyecto.TFG.dtos;

import com.proyecto.TFG.modelos.Factura;
import com.proyecto.TFG.modelos.Pedido;
import com.proyecto.TFG.modelos.Usuario;

import java.util.List;
public class DireccionDTO {

    private long Id;
    private String ciudad;
    private String direccion;
    private Usuario usuario;
    private List<FacturaDTO> factura;
    private List<PedidoDTO> pedidos;

    public DireccionDTO(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public com.proyecto.TFG.modelos.Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<FacturaDTO> getFactura() {
        return factura;
    }

    public void setFactura(List<FacturaDTO> factura) {
        this.factura = factura;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }
}
