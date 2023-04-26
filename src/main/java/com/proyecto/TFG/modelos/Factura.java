package com.proyecto.TFG.modelos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name  = "Facturas", catalog = "tfg")
public class Factura {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = true)
    private long id;
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "Fecha")
    private Date fecha;
    @ManyToOne()
    @JoinColumn(name = "Usuarios_Id")
    private Usuario usuario;
    private long direcciones_Id;

    public Factura(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getDirecciones_Id() {
        return direcciones_Id;
    }

    public void setDirecciones_Id(long direcciones_Id) {
        this.direcciones_Id = direcciones_Id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
