/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.AdminP;

/**
 *
 * @author braya
 */
public class ControladorAdminP extends ControladorAbstractoP<AdminP>{
    AdminP obtenerSesion;
    public ControladorAdminP() {
        super();
    }
    
    public boolean comprobarDatosAdmin(String correo, String cedula) {
        var ced = getEm().createNamedQuery("buscarCedula").setParameter("cedula", cedula).setParameter("correo", correo).getResultList();
        System.out.println("ced " + ced);
        if (ced.isEmpty()) {
            System.out.println("ced " + ced);
            return true;
        }else{
            return false;
            
        }
    }
    
    public boolean iniciarSesionA(String correo, String contrasenia) {
        var admC = getEm().createNamedQuery("iniciarA").setParameter("correo", correo).setParameter("cotrasenia", contrasenia).getResultList();
        if (admC.isEmpty()) {
            return false;
        }else{
            obtenerSesion = (AdminP) admC.get(0);
            return true;
        }
    }
    
    public AdminP obtenerSesion(){
        return obtenerSesion;
    }

    public AdminP getObtenerSesion() {
        return obtenerSesion;
    }

    public void setObtenerSesion(AdminP obtenerSesion) {
        this.obtenerSesion = obtenerSesion;
    }
    
}
