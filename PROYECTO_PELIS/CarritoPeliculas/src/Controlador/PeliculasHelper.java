/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author TOM
 */
public class PeliculasHelper {
    DBConexion conexion;
Pelicula pel;
public PeliculasHelper()
{
conexion=new DBConexion();
pel=null;
}

public boolean Agregar(Pelicula pel)
{
    Statement sent=conexion.getStatement();
    
   
    if(sent==null)
        return false;
    String sentencia1="INSERT INTO PELICULAS VALUES('";
    sentencia1+=pel.codigo+"','";
    sentencia1+=pel.titulo+"','";
    sentencia1+=pel.director+"','";
    sentencia1+=pel.actor_Prin+"','";
    sentencia1+=pel.genero+"',";
    sentencia1+=pel.precio+")";
    
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

public ArrayList<Pelicula> GetPeliculas()
    {
        ArrayList<Pelicula> pelicula = new ArrayList<Pelicula>();
        
         Statement sent = conexion.getStatement();
        if (sent == null)
            return pelicula;
        
        String strSQL = "SELECT * FROM PELICULAS";
        try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            
            //Si exite solo un empleado con el nombre dado
            while (rs.next())
            {
                String codigo = rs.getString("CODIGO");
                String titulo = rs.getString("TITULO");
                String director = rs.getString("DIRECTOR");
                String actorPrincipal=rs.getString("ACTOR_PRINCIPAL");
                String  genero=rs.getString("GENERO");
                float precio =rs.getFloat("PRECIO");
                
                
                
                Pelicula  pel = new Pelicula(codigo, titulo, director, actorPrincipal, genero,precio);
                
                pel.codigo= codigo;
                pel.titulo = titulo;
                pel.director = director;
                pel.actor_Prin = actorPrincipal;
                pel.genero=genero;
                pel.precio=precio;
                               
                pelicula.add(pel);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        
        return pelicula;
    }

}
