/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author braya
 */
@Entity
public class TicketP implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Cedula")
    private String cedula;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Contraseña")
    private String cotrasenia;
    @Column(name ="lugar")
    private int lugar;
    @Column(name ="fecha_Ingreso")
    private LocalDateTime fechaIngreso;
    @Column(name ="fecha_Salida")
    private LocalDateTime fechaSalida;
    @Column(name ="Tipo_Contrato")
    private String tipoContrato;
    @Column(name ="Finalizado")
    private boolean finalizadoC;

    public TicketP() {
        finalizadoC = false;
    }

    public TicketP(String cedula, String nombre, String apellido, String telefono, int lugar, LocalDateTime fechaIngreso, String tipoContrato) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.lugar = lugar;
        this.fechaIngreso = fechaIngreso;
        this.tipoContrato = tipoContrato;
    }

    public TicketP(String cedula, String nombre, String apellido, String telefono, int lugar, LocalDateTime fechaIngreso, String tipoContrato, boolean finalizadoC) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.lugar = lugar;
        this.fechaIngreso = fechaIngreso;
        this.tipoContrato = tipoContrato;
        this.finalizadoC = finalizadoC;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCotrasenia() {
        return cotrasenia;
    }

    public void setCotrasenia(String cotrasenia) {
        this.cotrasenia = cotrasenia;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public boolean isFinalizadoC() {
        return finalizadoC;
    }

    public void setFinalizadoC(boolean finalizadoC) {
        this.finalizadoC = finalizadoC;
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
        if (!(object instanceof TicketP)) {
            return false;
        }
        TicketP other = (TicketP) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Ticket[ id=" + id + " ]";
    }
    
}
