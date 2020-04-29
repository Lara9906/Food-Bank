/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.swing.JOptionPane;

/**
 *
 * @author lara_
 */
@ManagedBean
@ApplicationScoped
public class sistema {

    usuario loggin;
    usuario registro;

    public usuario getLoggin() {
        return loggin;
    }

    public void setLoggin(usuario loggin) {
        this.loggin = loggin;
    }

    public usuario getRegistro() {
        return registro;
    }

    public void setRegistro(usuario registro) {
        this.registro = registro;
    }

    public sistema(usuario loggin, usuario registro) {
        this.loggin = loggin;
        this.registro = registro;
    }

    public sistema() {
        this.loggin = new usuario();
        this.registro = new usuario();
    }

    public String registrar() {
        return "registrar";
    }

    public String iniciar() {
        System.out.println(this.loggin.toString());
        System.out.println(this.registro.toString());
        if (loggin.getCedula().equalsIgnoreCase(this.registro.getCedula()) && loggin.getContraseña().equalsIgnoreCase(this.registro.getContraseña())) {
            return "menu";

        } else {
            return "";
        }
    }

    public String retirar() {

        System.out.println("" + loggin.toString());
        if (loggin.getSaldo() - loggin.getValingresado() < 10000 || loggin.getValingresado() > 600000) {
            System.out.println("" + loggin.toString());
            return "error";

        } else {

            loggin.saldo = loggin.saldo - loggin.valingresado;
            loggin.setValingresado(0);
            System.out.println("" + loggin.toString());
            return "contador";

        }
    }
    
    public String consignar() {

        System.out.println("" + loggin.toString());
        if (loggin.getValingresado() < 0) {
            System.out.println("" + loggin.toString());
            return "error";

        } else {

            loggin.saldo = loggin.saldo + loggin.valingresado;
            loggin.setValingresado(0);
            System.out.println("" + loggin.toString());
            return "contador";

        }
    }
}
