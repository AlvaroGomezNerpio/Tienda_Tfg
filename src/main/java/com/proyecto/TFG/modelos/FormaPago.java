package com.proyecto.TFG.modelos;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name  = "formaspagos", catalog = "tfg")
public class FormaPago implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = true)
    private long id;
    @Column(name = "FormaPago")
    private String formaPago;

    @OneToMany(mappedBy = "formaPago",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FormaPagoUsuario> formaPagoUsuarios;

    @OneToMany(mappedBy = "formaPago",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedido> pedidos;

    public FormaPago() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public List<FormaPagoUsuario> getFormaPagoUsuarios() {
        return formaPagoUsuarios;
    }

    public void setFormaPagoUsuarios(List<FormaPagoUsuario> formaPagoUsuarios) {
        this.formaPagoUsuarios = formaPagoUsuarios;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
