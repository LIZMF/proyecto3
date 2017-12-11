/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author TOM
 */
public class Cliente {
    String idCliente;
    String nombre;
    String aPaterno;
    String aMaterno;
    String telefono;

    public Cliente(String idCliente,String nombre, String aPaterno, String aMaterno, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.telefono = telefono;
    }
    
     public Cliente(String idCliente,String nombre, String aPaterno,String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.telefono = telefono;
    }


    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the aPaterno
     */
    public String getaPaterno() {
        return aPaterno;
    }

    /**
     * @param aPaterno the aPaterno to set
     */
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    /**
     * @return the aMaterno
     */
    public String getaMaterno() {
        return aMaterno;
    }

    /**
     * @param aMaterno the aMaterno to set
     */
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}
