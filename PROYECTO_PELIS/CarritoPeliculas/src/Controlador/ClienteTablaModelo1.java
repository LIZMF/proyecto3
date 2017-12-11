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
public class ClienteTablaModelo1 extends  AbstractTableModel implements TableModelListener {

     ArrayList<Cliente> cliente;
    String[] encabezados;
    
    public ClienteTablaModelo1()
    {
        cliente  = new ArrayList<Cliente>();
        encabezados = new String[5];
        encabezados[0] = "CORREO ELECTRONICO";
        encabezados[1] = "NOMBRE";
        encabezados[2] = "APELL_PATERNO";
        encabezados[3] = "APELL_MATERNO";
        encabezados[4] = "TELEFONO";
        
    }
    
    public ClienteTablaModelo1(ArrayList<Cliente> cliente)
    {
        this();
        this.cliente = cliente;
    }
    
    @Override
    public int getRowCount() {
        return cliente.size();
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
        
        Cliente cl = cliente.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return cl.idCliente;
            case 1: return cl.nombre;
            case 2: return cl.aPaterno;
            case 3: return cl.aMaterno;
            case 4: return cl.telefono;
                        
            default: return "Non emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Cliente cl = cliente.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  cl.idCliente = (String)aValue;
                     break;
            case 1: cl.nombre = (String)aValue;
                     break;
            case 2: cl.aPaterno  = (String)aValue;
                     break;
            case 3: cl.aMaterno = (String)aValue;
                     break;
            case 4: cl.telefono = (String)aValue;
                     break;
            
            
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
}
