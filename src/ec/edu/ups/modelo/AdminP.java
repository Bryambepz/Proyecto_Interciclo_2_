/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author braya
 */
@Entity
//@NamedQueries({
    @NamedQuery(name = "buscarCedula", query = "Select a from AdminP a where a.cedula = :cedula AND " + "a.correo = :correo" )
    @NamedQuery(name = "iniciarA", query = "Select a from AdminP a where a.correo = :correo AND " + "a.cotrasenia = :cotrasenia" )
//})
public class AdminP implements Serializable {

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
    @Column(name = "Lugares_Disponibles")
    private int lugaresDisp;
    @Column(name = "Lugares_Ocupados")
    private int lugaresOcupados;
    ///
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Usuario> listaUsuarios;
    //
    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AutomovilP> listaAutomoviles;

    public AdminP() {
        listaUsuarios = new ArrayList<>();
        listaAutomoviles = new ArrayList<>();
    }

    public AdminP(String cedula, String nombre, String apellido, String telefono, String correo, String cotrasenia, int lugaresDisp, int lugaresOcupados) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.cotrasenia = cotrasenia;
        this.lugaresDisp = lugaresDisp;
        this.lugaresOcupados = lugaresOcupados;
        listaUsuarios = new ArrayList<>();
        listaAutomoviles = new ArrayList<>();
    }

    public AdminP(Long id, String cedula, String nombre, String apellido, String telefono, String correo, String cotrasenia, int lugaresDisp, int lugaresOcupados, List<Usuario> listaUsuarios) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.cotrasenia = cotrasenia;
        this.lugaresDisp = lugaresDisp;
        this.lugaresOcupados = lugaresOcupados;
        this.listaUsuarios = new ArrayList<>();
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

    public int getLugaresDisp() {
        return lugaresDisp;
    }

    public void setLugaresDisp(int lugaresDisp) {
        this.lugaresDisp = lugaresDisp;
    }

    public int getLugaresOcupados() {
        return lugaresOcupados;
    }

    public void setLugaresOcupados(int lugaresOcupados) {
        this.lugaresOcupados = lugaresOcupados;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<AutomovilP> getListaAutomoviles() {
        return listaAutomoviles;
    }

    public void setListaAutomoviles(List<AutomovilP> listaAutomoviles) {
        this.listaAutomoviles = listaAutomoviles;
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
        if (!(object instanceof AdminP)) {
            return false;
        }
        AdminP other = (AdminP) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "ec.edu.ups.modelo.Admin[ id=" + id + " ]";
//    }

    @Override
    public String toString() {
        return "AdminP{" + "id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", correo=" + correo + ", cotrasenia=" + cotrasenia + ", lugaresDisp=" + lugaresDisp + ", lugaresOcupados=" + lugaresOcupados + ", listaUsuarios=" + listaUsuarios + ", listaAutomoviles=" + listaAutomoviles + '}';
    }
    
}
