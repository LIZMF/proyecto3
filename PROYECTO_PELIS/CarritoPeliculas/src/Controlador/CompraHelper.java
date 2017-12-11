/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TOM
 */
public class CompraHelper {
    DBConexion conexion=new DBConexion();
    Compra compra;
    
    public CompraHelper(){
        conexion=new DBConexion();
        compra=null;
    }
    
    public boolean Agregar(Compra compra){
    Statement sent=conexion.getStatement();
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO COMPRA VALUES('";
    sentencia1+=compra.getIdCompra()+"','";
    sentencia1+=compra.idCliente+"')";
    int num=0;
    try
    {
        sent.executeUpdate(sentencia1);
    }
    catch(SQLException e)
    {
    return false;
    }
    return true;
  }
    
}
