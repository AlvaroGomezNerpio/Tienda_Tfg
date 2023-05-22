package com.proyecto.TFG.modelos;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name  = "comentarios", catalog = "tfg")
public class Comentario implements Serializable {

    private static final long serialVersionUID = 8117386946996287653L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = true)
    private long Id;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Mensaje")
    private String  mensaje;
    @Column(name = "Puntuacion")
    private int puntuacion;

    @ManyToOne()
    @JoinColumn(name = "Usuarios_Id")
    private Usuario usuario;

    @ManyToOne()
    @JoinColumn(name = "Productos_Id")
    private Producto producto;


    public Comentario(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
