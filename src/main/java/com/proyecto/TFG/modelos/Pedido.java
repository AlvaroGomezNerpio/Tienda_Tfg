package com.proyecto.TFG.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name  = "Pedidos", catalog = "tfg")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = true)
    private long Id;
    private LocalDate fechaEntrega;

    @ManyToOne()
    @JoinColumn(name = "Usuarios_Id")
    private Usuario usuario;

    @ManyToOne()
    @JoinColumn(name = "Direcciones_Id")
    private Direccion direccion;

    @ManyToOne()
    @JoinColumn(name = "FormasPagos_Id")
    private FormaPago formaPago;

    public Pedido(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
}
