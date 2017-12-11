/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritopeliculas;

import Controlador.DBConexion;
import Controlador.Pelicula;
import Controlador.PeliculaTablaModelo;
import Controlador.PeliculasHelper;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TOM
 */
public class PeliculaVentana extends javax.swing.JFrame {
    ArrayList<Pelicula> lista;
    Pelicula pel;
    PeliculasHelper ph;
    PeliculaTablaModelo pTable;
    DBConexion conexion;
  
    /**
     * Creates new form TallerVentana
     */
     public PeliculaVentana(Pelicula peli) {
        this();
        pel=peli;
       llenarDatos();
       
        
    }
    
    public PeliculaVentana() {
        initComponents();
        conexion = new DBConexion();
        pel=null;
        ph=null;
        PeliculasHelper db =new PeliculasHelper();
        lista=db.GetPeliculas();
        
        PeliculaTablaModelo modelo = new PeliculaTablaModelo(lista);
         
         jTable1.setModel(modelo);
    }

    private void llenarDatos()
    {
        txtCodigo.setText(String.valueOf(pel.getCodigo()));
        txtTitulo.setText(String.valueOf(pel.getTitulo()));
        txtDirector.setText(String.valueOf(pel.getDirector()));
        txtActor.setText(String.valueOf(pel.getActor_Prin()));
        txtGenero.setText(String.valueOf(pel.getGenero()));
        txtPrecio.setText(String.valueOf(pel.getPrecio()));
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblActor = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtActor = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        lblDirector = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setTitle("Talleres");
        setResizable(false);

        lblTitulo.setText("Titulo");

        jLabel2.setText("Descripcion:");

        lblActor.setText("Actor Principal");

        lblGenero.setText("Genero");

        btAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAgregar.setText("Guardar");
        btAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarMouseClicked(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        lblCodigo.setText("Codigo");

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });

        lblDirector.setText("Director");

        jLabel4.setText("Precio");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Compras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Usuarios");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblActor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtActor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDirector)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAgregar)
                                .addGap(28, 28, 28)
                                .addComponent(btneliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(lblDirector)
                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblActor)
                    .addComponent(txtActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgregar)
                    .addComponent(btnSalir)
                    .addComponent(btneliminar)
                    .addComponent(btnEditar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarMouseClicked
        try {
        if(txtTitulo.getText().equals("")||txtCodigo.getText().equals("")||lblActor.getText().equals("")||txtGenero.getText().equals("")||txtDirector.getText().equals("")||txtPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Datos no validos","Verificar la información",JOptionPane.INFORMATION_MESSAGE);
        }
        else{   
           
                DBConexion conexion=new DBConexion();
                Statement stent=conexion.getStatement();
                ResultSet rs=stent.executeQuery("SELECT * FROM PELICULAS ");
                ph=new PeliculasHelper();
                pel=new Pelicula(txtCodigo.getText(),txtTitulo.getText(), txtDirector.getText(), txtActor.getText(), txtGenero.getText(),Float.parseFloat(txtPrecio.getText()));
                if(ph.Agregar(pel)==true){
                    JOptionPane.showMessageDialog(null,"Operacion Exitosa","Taller Agregado",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(true);
                    PeliculasHelper db =new PeliculasHelper();
        lista=db.GetPeliculas();
        
        PeliculaTablaModelo modelo = new PeliculaTablaModelo(lista);
         
         jTable1.setModel(modelo);
                   
                }
                }
            } catch(HeadlessException er)
        {
            System.out.println("ERROR: "+er.getMessage());
        } catch (SQLException ex) {               
           Logger.getLogger(PeliculaVentana.class.getName()).log(Level.SEVERE, null, ex);
       }               
        
        
    }//GEN-LAST:event_btAgregarMouseClicked

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseClicked
try {
                Statement sent=conexion.getStatement();
                if(sent==null)
                    return;
               String sentencia="DELETE FROM PELICULAS  WHERE CODIGO='"+txtCodigo.getText()+"'";
                
                int estado=sent.executeUpdate(sentencia);
                if(estado==1)
                    JOptionPane.showMessageDialog(null, "Pelicula  ELIMINADA","Transaccion exitosa",JOptionPane.INFORMATION_MESSAGE);
                PeliculasHelper db =new PeliculasHelper();
        lista=db.GetPeliculas();
        
        PeliculaTablaModelo modelo = new PeliculaTablaModelo(lista);
         
         jTable1.setModel(modelo);
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Pelicula no actualizada","Transaccion fallida",JOptionPane.ERROR);
            }
      
      
      
      
       
    }//GEN-LAST:event_btneliminarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
           if (evt.getClickCount()==1)
        {
            int index = jTable1.getSelectedRow();
            final Pelicula pel = lista.get(index);
            txtCodigo.setText(pel.getCodigo());
            
            txtCodigo.setEditable(false);
            txtTitulo.setEnabled(true);
            txtDirector.setEnabled(true);
            txtGenero.setEnabled(true);
            txtActor.setEnabled(true);
            txtPrecio.setEnabled(true);
            
                      
        }        // TODO add your handling code here:
                               
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          ClienteFrm cfrm= new ClienteFrm();
    cfrm.show(true);
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       try {
                Statement sent=conexion.getStatement();
                if(sent==null)
                    return;
                String sentencia="UPDATE PELICULAS SET TITULO='"+txtTitulo.getText()+"',";
                sentencia+="DIRECTOR='"+txtDirector.getText()+"',";
                sentencia+="ACTOR_PRINCIPAL='"+txtActor.getText()+"',";
                 sentencia+="GENERO='"+txtGenero.getText()+"',";
                sentencia+="PRECIO='"+txtPrecio.getText()+"' WHERE CODIGO ="+txtCodigo.getText()+"";
                int estado=sent.executeUpdate(sentencia);
                if(estado==1)
                    JOptionPane.showMessageDialog(null, "Pelicula  actualizada","Transaccion exitosa",JOptionPane.INFORMATION_MESSAGE);
                PeliculasHelper db =new PeliculasHelper();
        lista=db.GetPeliculas();
        
        PeliculaTablaModelo modelo = new PeliculaTablaModelo(lista);
         
         jTable1.setModel(modelo);
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Pelicula no actualizada","Transaccion fallida",JOptionPane.ERROR);
            }
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeliculaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeliculaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeliculaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeliculaVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeliculaVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblActor;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtActor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
