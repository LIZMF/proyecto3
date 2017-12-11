/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author TOM
 */
public class ClienteHelper {
    DBConexion conexion;
    Cliente client;
public ClienteHelper()
{
conexion=new DBConexion();
client=null;
}

public boolean Agregar(Cliente client)
{
    Statement sent=conexion.getStatement();
    
    FileInputStream fis = null;
    PreparedStatement ps = null;
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO CLIENTES_PEL VALUES('";
    sentencia1+=client.idCliente+"','";
    sentencia1+=client.nombre+"','";
    sentencia1+=client.aPaterno+"','";
    sentencia1+=client.aMaterno+"','";
    sentencia1+=client.telefono+"')";
        
    int num=0;
    try
    {
        sent.executeUpdate(sentencia1);
    }
    catch(SQLException e)
    {
    System.out.println("Error: "+e.getMessage());
    }
    
    return true;
}

public ArrayList<Cliente> GetClientes()
    {
        ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return cliente;
        
        String strSQL = "SELECT * FROM CLIENTES_PEL";
        try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                String idCliente =rs.getString("ID_CLIENTE");
                String nombre = rs.getString("NOMBRE");
                String aPaterno = rs.getString("APELL_PAT");
                String aMaterno = rs.getString("APELL_MAT");
                String telefono=rs.getString("TELEFONO");
                              
                
                Cliente cl =new Cliente(idCliente,nombre, aPaterno, aMaterno, telefono);
                
                cl.idCliente =idCliente;
                cl.nombre= nombre;
                cl.aPaterno = aPaterno;
                cl.aMaterno = aMaterno;
                cl.telefono = telefono;
                                           
                cliente.add(cl);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return cliente;
    }


public boolean Eliminar(String idCliente)
{
   Statement sent = conexion.getStatement();
    if (sent == null)
    return false;

    String sentencia="DELETE FROM CLIENTE WHERE ID_CLIENTE='"+idCliente+"';";
    
    int num = 0;
        try
        {
            num = sent.executeUpdate(sentencia);
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
         return num == 1;
}

}
