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
public class Compra {
    
    String idCompra;
    String idCliente;
    public Compra(String idCompra,String idCliente) {
        this.idCompra = idCompra;
        this.idCliente=idCliente;
        
    }

    /**
     * @return the idCompra
     */
    public String getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }
    
    
    
}
