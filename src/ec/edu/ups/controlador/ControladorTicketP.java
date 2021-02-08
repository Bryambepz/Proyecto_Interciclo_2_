/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.TicketP;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author braya
 */
public class ControladorTicketP extends ControladorAbstractoP<TicketP>{

    public ControladorTicketP() {
        super();
    }
    
    public double total(String tipoC, LocalDateTime horaIngreso, LocalDateTime horaSalida) {
        double pagar = 0;
        if (tipoC.equals("Por Horas")) {
            long nhoras = ChronoUnit.HOURS.between(horaIngreso, horaSalida);
            if (nhoras <= 12) {
                if (nhoras == 0) {
                    pagar = 0.50;
                }else{
                    pagar = nhoras * 0.50;
                }
            } else {
                pagar = (nhoras * 0.50) * 0.1 + (nhoras * 0.50);
            }
            return pagar;
        } else if (tipoC.equals("Por Dias")) {
            long nDias = ChronoUnit.DAYS.between(horaIngreso, horaSalida);
            if (nDias <= 10) {
                if (nDias == 0) {
                    pagar = 5.0;
                }else{
                    pagar = nDias * 5;
                }
            } else {
                pagar = (nDias * 5) * 0.10 + (nDias * 5);
            }
            return pagar;
        } else if (tipoC.equals("Por Semanas")) {
            long nSemanas = ChronoUnit.WEEKS.between(horaIngreso, horaSalida);
            if (nSemanas <= 4) {
                if (nSemanas == 0) {
                    pagar = 30.0;
                }else{
                    pagar = nSemanas * 30;
                }
            } else {
                pagar = (nSemanas * 30) * 0.1 + (nSemanas * 30);
            }
            return pagar;
        } else if (tipoC.equals("Por Mes")) {
            long nMes = ChronoUnit.MONTHS.between(horaIngreso, horaSalida);
            if (nMes > 1) {
                pagar = (nMes * 60) * 0.1 + (nMes * 60);
            } else {
                pagar = 60.0;
            }
            return pagar;
        }
        if (true) {

        }
        return 0;
    }
}
