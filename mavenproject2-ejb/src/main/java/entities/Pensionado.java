/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Nelson
 */
@Entity
public class Pensionado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pen_rut;
    private String pen_nombres;
    private String pen_apellidos;
    private String pen_fechaNacimiento;
    private String pen_estadoCivil;
    private String pen_direccion;
    private String pen_comuna;
    private String pen_region;
    private String pen_telefonoFijo;
    private String pen_celular;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPen_rut() {
        return pen_rut;
    }

    public void setPen_rut(String pen_rut) {
        this.pen_rut = pen_rut;
    }

    public String getPen_nombres() {
        return pen_nombres;
    }

    public void setPen_nombres(String pen_nombres) {
        this.pen_nombres = pen_nombres;
    }

    public String getPen_apellidos() {
        return pen_apellidos;
    }

    public void setPen_apellidos(String pen_apellidos) {
        this.pen_apellidos = pen_apellidos;
    }

    public String getPen_fechaNacimiento() {
        return pen_fechaNacimiento;
    }

    public void setPen_fechaNacimiento(String pen_fechaNacimiento) {
        this.pen_fechaNacimiento = pen_fechaNacimiento;
    }

    public String getPen_estadoCivil() {
        return pen_estadoCivil;
    }

    public void setPen_estadoCivil(String pen_estadoCivil) {
        this.pen_estadoCivil = pen_estadoCivil;
    }

    public String getPen_direccion() {
        return pen_direccion;
    }

    public void setPen_direccion(String pen_direccion) {
        this.pen_direccion = pen_direccion;
    }

    public String getPen_comuna() {
        return pen_comuna;
    }

    public void setPen_comuna(String pen_comuna) {
        this.pen_comuna = pen_comuna;
    }

    public String getPen_region() {
        return pen_region;
    }

    public void setPen_region(String pen_region) {
        this.pen_region = pen_region;
    }

    public String getPen_telefonoFijo() {
        return pen_telefonoFijo;
    }

    public void setPen_telefonoFijo(String pen_telefonoFijo) {
        this.pen_telefonoFijo = pen_telefonoFijo;
    }

    public String getPen_celular() {
        return pen_celular;
    }

    public void setPen_celular(String pen_celular) {
        this.pen_celular = pen_celular;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pensionado)) {
            return false;
        }
        Pensionado other = (Pensionado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pensionado[ id=" + id + " ]";
    }
    
}
