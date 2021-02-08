/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorUsuarioP extends ControladorAbstractoP<Usuario>{
    Usuario obtenerSesion;

    public ControladorUsuarioP() {
        super();
    }
    
    public boolean comprobarDatos(String correo, String cedula) {
        var ced = getEm().createNamedQuery("buscarCedulaU").setParameter("cedula", cedula).setParameter("correo", correo).getResultList();
        System.out.println("cedUU " + ced);
        if (ced.isEmpty()) {
            System.out.println("cedUU " + ced);
            return true;
        }else{
            return false;
        }
    }
    

    public boolean iniciarSesionU(String correo, String contrasenia) {
        var admC = getEm().createNamedQuery("IniciarU").setParameter("correo", correo).setParameter("cotrasenia", contrasenia).getResultList();
        if (admC.isEmpty()) {
            return false;
        }else{
            obtenerSesion = (Usuario) admC.get(0);
            return true;
        }
    }
    
    public List<Usuario> buscar(int id){
        List<Usuario> uc = getEm().createNamedQuery("buscarticket").setParameter(":id", id).getResultList();
        if (uc != null && uc.get(0).getCedula().equals(obtenerSesion().getCedula())) {
            return uc;
        }
        return null;
    }
    
    public Usuario obtenerSesion(){
        return obtenerSesion;
    }
}
