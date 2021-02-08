/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.AutomovilP;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author braya
 */
public class ControladorAutomovilP extends ControladorAbstractoP<AutomovilP> implements Runnable {

    private JLabel boton;
    private int x;
    private int y;
    Thread t;

    public ControladorAutomovilP() {
        super();
        //t = new Thread(this);
    }

    public ControladorAutomovilP(JLabel boton, int x, int y) {
        this.boton = boton;
        this.x = x;
        this.y = y;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            this.mover(boton, t, x, y);
        }
    }

    
}
