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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author braya
 */
@Entity
//@NamedQueries({
        @NamedQuery(name = "buscarCedulaU", query = "Select u from Usuario u where u.cedula = :cedula AND " + " u.correo = :correo" )
        @NamedQuery(name = "IniciarU", query = "Select u from Usuario u where u.correo = :correo AND u.cotrasenia = :cotrasenia" )
        @NamedQuery(name = "buscarticket", query = "Select u from Usuario u where u.id = :id AND " + " u.cedula = :cedula" )
//})
public class Usuario implements Serializable {

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
    ////////////////
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AutomovilP> listaAutomoviles;
    ///
    @ManyToOne
    @JoinColumn(name = "fk_Admin")
    private AdminP admin;
    ///////////////

    public Usuario() {
        listaAutomoviles = new ArrayList<>();
    }

    public Usuario(String cedula, String nombre, String apellido, String telefono, String correo, String cotrasenia, AdminP admin) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.cotrasenia = cotrasenia;
        this.admin = admin;
    }
    
    public Usuario(String cedula, String nombre, String apellido, String telefono, String correo, String cotrasenia, List<AutomovilP> listaAutomoviles, AdminP admin) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.cotrasenia = cotrasenia;
        this.listaAutomoviles = listaAutomoviles;
        this.admin = admin;
        listaAutomoviles = new ArrayList<>();
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

    public List<AutomovilP> getListaAutomoviles() {
        return listaAutomoviles;
    }

    public void setListaAutomoviles(List<AutomovilP> listaAutomoviles) {
        this.listaAutomoviles = listaAutomoviles;
    }

    public AdminP getAdmin() {
        return admin;
    }

    public void setAdmin(AdminP admin) {
        this.admin = admin;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    public AutomovilP buscar(int id){
        for (int i = 0; i < listaAutomoviles.size(); i++) {
            AutomovilP get = listaAutomoviles.get(i);
            if (id == get.getTicket().getId()) {
                return get;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Usuario[ id=" + id + " ]";
    }
    
}
