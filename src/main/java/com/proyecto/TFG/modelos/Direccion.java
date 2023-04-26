package com.proyecto.TFG.modelos;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name  = "Direcciones", catalog = "tfg")
public class Direccion {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = true)
    private long Id;
    public String ciudad;
    public String direccion;
    @ManyToOne()
    @JoinColumn(name = "Usuarios_Id")
    private Usuario usuario;

    @OneToMany(mappedBy = "direccion",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> factura;

    public Direccion(){

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Factura> getFactura() {
        return factura;
    }

    public void setFactura(List<Factura> factura) {
        this.factura = factura;
    }
}
