package com.proyecto.TFG.modelos;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name  = "FormaPagos", catalog = "tfg")
public class FormaPago implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = true)
    private long id;
    @Column(name = "FormaPago")
    private String formaPago;

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
}
