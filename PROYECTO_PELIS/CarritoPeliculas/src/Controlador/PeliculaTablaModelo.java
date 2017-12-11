/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TOM
 */
public class PeliculaTablaModelo extends  AbstractTableModel implements TableModelListener {

     ArrayList<Pelicula> pelicula;
    String[] encabezados;
    
    public PeliculaTablaModelo()
    {
        pelicula  = new ArrayList<Pelicula>();
        encabezados = new String[6];
        encabezados[0] = "CODIGO";
        encabezados[1] = "TITULO";
        encabezados[2] = "DIRECTOR";
        encabezados[3] = "ACTOR_PRINCIPAL";
        encabezados[4] = "GENERO";
        encabezados[5] = "PRECIO";
        
    }
    
    public PeliculaTablaModelo(ArrayList<Pelicula> pelicula)
    {
        this();
        this.pelicula = pelicula;
    }
    
    @Override
    public int getRowCount() {
        return pelicula.size();
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex >= 0 && columnIndex < encabezados.length)
            return encabezados[columnIndex];
        
        return "Sin Nombre";
    }

    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Pelicula pel = pelicula.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return pel.codigo;
            case 1: return pel.titulo;
            case 2: return pel.director;
            case 3: return pel.actor_Prin;
            case 4: return pel.genero;
            case 5:return pel.precio;
            
            default: return "Non emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Pelicula peli = pelicula.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  peli.codigo = (String)aValue;
                     break;
            case 1: peli.titulo = (String)aValue;
                     break;
            case 2: peli.director  = (String)aValue;
                     break;
            case 3: peli.actor_Prin = (String)aValue;
                     break;
            case 4: peli.genero = (String)aValue;
                     break;
            case 5: peli.precio =(Float)aValue;
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
}
