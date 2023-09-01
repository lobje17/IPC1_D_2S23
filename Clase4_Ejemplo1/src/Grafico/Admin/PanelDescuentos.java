/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico.Admin;

import Archivos.Binario;
import Archivos.Texto;
import Clases.DatosEnviados;
import Clases.Descuento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lobje
 */
public class PanelDescuentos extends javax.swing.JPanel {
    
    DefaultTableModel modeloTabla;
    DatosEnviados datosEnviados;
    Binario binario;
    Texto texto;
    /**
     * Creates new form Descuentos
     */
    public PanelDescuentos() {
        initComponents();
        this.binario = new Binario();
        this.texto = new Texto();
    }
    
    public void recibirDatos(DatosEnviados datosEnviados){
        this.datosEnviados = datosEnviados;
        llenarTabla();
    }

    /* ************************************************************
       ************************************************************ */
    public void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("No.");
        modeloTabla.addColumn("Dias");
        modeloTabla.addColumn("porcentaje");
        
        int tam = this.datosEnviados.listDescuentos.cantidad();
        
        Descuento desc;
        for (int i = 0; i < tam; i++) {
            desc = this.datosEnviados.listDescuentos.getElemento(i);
            agregaFila(i+1, desc.getNumDias(), desc.getPorcentaje());
        }
        
        this.tablaDescuento.setModel(modeloTabla);
        
    }
    
    private void agregaFila(int no, int dias, int porc){
        this.modeloTabla.addRow(new Object[]{dato(no), dato(dias), dato(porc)});
        
        this.tablaDescuento.setModel(modeloTabla);
    }
    
    private String dato(int val){
        return String.valueOf(val);
    }
    
    /* ************************************************************
       ************************************************************ */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncargaDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDescuento = new javax.swing.JTable();
        btnAgregarDescuento = new javax.swing.JButton();
        btnCargamasiva = new javax.swing.JButton();
        btnGuardaDatos = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 0));
        setPreferredSize(new java.awt.Dimension(600, 400));

        btncargaDatos.setBackground(new java.awt.Color(255, 153, 0));
        btncargaDatos.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btncargaDatos.setForeground(new java.awt.Color(255, 255, 255));
        btncargaDatos.setText("Carga de datos");
        btncargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargaDatosActionPerformed(evt);
            }
        });

        tablaDescuento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaDescuento.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tablaDescuento);

        btnAgregarDescuento.setBackground(new java.awt.Color(0, 102, 0));
        btnAgregarDescuento.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnAgregarDescuento.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarDescuento.setText("Agregar descuento");
        btnAgregarDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDescuentoActionPerformed(evt);
            }
        });

        btnCargamasiva.setBackground(new java.awt.Color(0, 0, 102));
        btnCargamasiva.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btnCargamasiva.setForeground(new java.awt.Color(255, 255, 255));
        btnCargamasiva.setText("Carga masiva");
        btnCargamasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargamasivaActionPerformed(evt);
            }
        });

        btnGuardaDatos.setText("Guardar datos");
        btnGuardaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncargaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnCargamasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarDescuento)
                        .addGap(60, 60, 60)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncargaDatos)
                    .addComponent(btnAgregarDescuento)
                    .addComponent(btnCargamasiva)
                    .addComponent(btnGuardaDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDescuentoActionPerformed
        // TODO add your handling code here:
        VentanaDescuento vd = new VentanaDescuento();
        vd.setVisible(true);
        vd.recibirDatos(datosEnviados, this);
    }//GEN-LAST:event_btnAgregarDescuentoActionPerformed

    private void btnGuardaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaDatosActionPerformed
        // TODO add your handling code here:
        boolean ok = binario.guardar(datosEnviados.listDescuentos);
        if(ok)  Mensaje("Se guardaron los datos");
        else    Mensaje("Ocurrio un error, no se guardaron los datos");
    }//GEN-LAST:event_btnGuardaDatosActionPerformed

    private void btncargaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargaDatosActionPerformed
        // TODO add your handling code here:
        datosEnviados.listDescuentos = binario.obtener();
        llenarTabla();
        Mensaje("Datos cargados");
    }//GEN-LAST:event_btncargaDatosActionPerformed

    private void btnCargamasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargamasivaActionPerformed
        // TODO add your handling code here:
        String path = texto.Buscar();
        texto.cargarDescuentos(path, datosEnviados.listDescuentos);
        llenarTabla();
        Mensaje("Datos cargados");
    }//GEN-LAST:event_btnCargamasivaActionPerformed



     /* ************************************************************
                Mesajes en interfaz grafica
       ************************************************************ */
    private void Mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDescuento;
    private javax.swing.JButton btnCargamasiva;
    private javax.swing.JButton btnGuardaDatos;
    private javax.swing.JButton btncargaDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDescuento;
    // End of variables declaration//GEN-END:variables
}