/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Grafico.Admin;

import Archivos.PDF;
import Clases.DatosEnviados;
import Clases.Vehiculos.Vehiculo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lobje
 */
public class PanelVehiculos extends javax.swing.JPanel {
    DatosEnviados datosEnviados;
    DefaultTableModel modeloTabla;
    /**
     * Creates new form PanelVehiculos
     */
    public PanelVehiculos() {
        initComponents();
    }

    /* **********************************************************************
     * ******************** METODO QUE RECIBE LAS LISTAS ********************
     * ********************************************************************** */
    public void recibirDatos(DatosEnviados datosEnviados){
        this.datosEnviados = datosEnviados;
        llenarTabla();
    }

    /* **********************************************************************
     * ********************** TABLA PARA MOSTRAR DATOS **********************
     * ********************************************************************** */
    public void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        agregarEncabezado();
        int tam = this.datosEnviados.cantidadVehiculos();
        
        Vehiculo v;
        for (int i = 0; i < tam; i++) {
            v = this.datosEnviados.getVehiculos(i);
            agregaFila(i+1, v.getMarca(), v.getLinea(), v.getModelo(), v.getPlaca(), v.getCostoDia(), v.isDisponible());
        }
        
        this.tablaVehiculos.setModel(modeloTabla);        
    }
    
    private void agregarEncabezado(){
        this.modeloTabla.addColumn("No.");
        this.modeloTabla.addColumn("Marca");
        this.modeloTabla.addColumn("Linea");
        this.modeloTabla.addColumn("Modelo");
        this.modeloTabla.addColumn("Placa");
        this.modeloTabla.addColumn("Costo por dia");
        this.modeloTabla.addColumn("Disponible");
    }
    
    private void agregaFila(int no, String marca, String linea, int modelo, String placa, int costo, boolean disponible){
        String si = "Si";
        if(!disponible) si = "No";
        this.modeloTabla.addRow(new Object[]{dato(no), marca, linea, dato(modelo), placa, dato(costo), si});
        this.tablaVehiculos.setModel(modeloTabla);
    }
    
    private String dato(int val){
        return String.valueOf(val);
    }

    /* **********************************************************************
     * ************************** ARCHIVO BINARIO  **************************
     * ********************************************************************** */    
    private void guardarData(){
        boolean ok = this.datosEnviados.almacenarVehiculosBin();
        if(ok)  Mensaje("Se guardaron los datos");
        else    Mensaje("Ocurrio un error, no se guardaron los datos");
    }
    
    private void recuparaData(){
        datosEnviados.obtenerVehiculos();
        llenarTabla();
        Mensaje("Datos cargados");
    }
    /* **********************************************************************
     * *********** MENSAJES MOSTRADO A TRAVES DE INTERFAZ GRAFICA ***********
     * ********************************************************************** */
    private void Mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarDatos = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        btnCargaMasiva = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnCreaPDF = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 102));

        btnGuardarDatos.setBackground(new java.awt.Color(255, 153, 0));
        btnGuardarDatos.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnGuardarDatos.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarDatos.setText("Guardar datos");
        btnGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosActionPerformed(evt);
            }
        });

        btnCargarDatos.setBackground(new java.awt.Color(255, 153, 0));
        btnCargarDatos.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnCargarDatos.setForeground(new java.awt.Color(0, 0, 0));
        btnCargarDatos.setText("Cargar datos");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        btnCargaMasiva.setBackground(new java.awt.Color(255, 153, 0));
        btnCargaMasiva.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnCargaMasiva.setForeground(new java.awt.Color(0, 0, 0));
        btnCargaMasiva.setText("Carga masiva");
        btnCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaVehiculos.setBackground(new java.awt.Color(255, 255, 0));
        tablaVehiculos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tablaVehiculos.setForeground(new java.awt.Color(0, 0, 0));
        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaVehiculos);

        btnEliminar.setBackground(new java.awt.Color(255, 153, 0));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCreaPDF.setBackground(new java.awt.Color(204, 0, 0));
        btnCreaPDF.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnCreaPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnCreaPDF.setText("PDF");
        btnCreaPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaPDFActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCreaPDF)
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDatos)
                    .addComponent(btnCargarDatos)
                    .addComponent(btnCargaMasiva)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCreaPDF))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed
        guardarData();
    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        recuparaData();
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaActionPerformed
        datosEnviados.cargarMasivaVehiculos();
        llenarTabla();
        Mensaje("Datos cargados");
    }//GEN-LAST:event_btnCargaMasivaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        VentanaRegistroVehiculo rv = new VentanaRegistroVehiculo();
        rv.setVisible(true);
        rv.recibirDatos(datosEnviados, this);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCreaPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaPDFActionPerformed
        PDF pdf = new PDF();
        pdf.CrearDoc("Archivos//Lista Vehiculos", datosEnviados.listVehiculos);
    }//GEN-LAST:event_btnCreaPDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnCreaPDF;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVehiculos;
    // End of variables declaration//GEN-END:variables
}