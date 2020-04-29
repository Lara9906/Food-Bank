/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ok;

/**
 *
 * @author lara_
 */
public class usuario {
    
    String nombre;
    String apellido;
    private String cedula;
    int edad;
    String correo;
    String telefono;
    String contraseña;
    double saldo;
    double valingresado;

    public usuario(String nombre, String apellido, String cedula, int edad, String correo, String telefono, String contraseña, double saldo,double valingresado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.saldo = saldo;
        this.valingresado =valingresado;
    }
    
    public usuario() {
        this.nombre = "";
        this.apellido = "";
        this.cedula = "";
        this.correo = "";
        this.contraseña = "";
        this.saldo = 100000;
        this.valingresado = 0; 
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + ", contrase\u00f1a=" + contraseña + ", saldo=" + saldo + ", valingresado=" + valingresado + '}';
    }

    public double getValingresado() {
        return valingresado;
    }

    public void setValingresado(double valingresado) {
        this.valingresado = valingresado;
    }
    
    

     
}
