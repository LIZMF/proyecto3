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
public class CompraTabla extends  AbstractTableModel implements TableModelListener {

     ArrayList<Compra> compra;
    String[] encabezados;
    
    public CompraTabla()
    {
        compra  = new ArrayList<Compra>();
        encabezados = new String[2];
        encabezados[0] = "ID_COMPRA";
        encabezados[1] = "USUARIO";
              
    }
    
    public CompraTabla(ArrayList<Compra> compra)
    {
        this();
        this.compra = compra;
    }
    
    @Override
    public int getRowCount() {
        return compra.size();
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
        
        Compra com = compra.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0: return com.idCompra;
            case 1: return com.idCliente;
                                    
            default: return "Non emplementar";
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex<0 && columnIndex< 0)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        Compra com = compra.get(rowIndex);
        
        switch(columnIndex)
        {
            case 0:  com.idCompra = (String)aValue;
                     break;
            case 1: com.idCliente = (String)aValue;
                     break;
           
        }
        
    }

           @Override
    public void tableChanged(TableModelEvent e) {
       
    }
}
