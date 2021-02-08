/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author braya
 */
@Entity
public class AutomovilP implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "placa")
    private String placa;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "color")
    private String color;
    ///
    @OneToOne
    @JoinColumn(name = "fk_ticket")
    private TicketP ticket;
    ///
    @ManyToOne
    @JoinColumn(name = "fk_admin")
    private AdminP admin;
    ///
    @ManyToOne
    @JoinColumn(name = "fk_usuario")
    private Usuario usuario;

    public AutomovilP() {
    }

//    public AutomovilP(String placa, String modelo, String color, TicketP ticket) {
//        this.placa = placa;
//        this.modelo = modelo;
//        this.color = color;
//        this.ticket = ticket;
//    }

    public AutomovilP(String placa, String modelo, String color, TicketP ticket, AdminP admin, Usuario usuario) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.ticket = ticket;
        this.admin = admin;
        this.usuario = usuario;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TicketP getTicket() {
        return ticket;
    }

    public void setTicket(TicketP ticket) {
        this.ticket = ticket;
    }

    public AdminP getAdmin() {
        return admin;
    }

    public void setAdmin(AdminP admin) {
        this.admin = admin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        if (!(object instanceof AutomovilP)) {
            return false;
        }
        AutomovilP other = (AutomovilP) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.modelo.Automovil[ id=" + id + " ]";
    }
    
}
