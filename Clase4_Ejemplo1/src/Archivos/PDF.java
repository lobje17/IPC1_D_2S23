/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Clases.Vehiculos.ListaVehiculos;
import Clases.Vehiculos.Vehiculo;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
/**
 *
 * @author lobje
 */
public class PDF {
    String nombre;
    public PDF() {
    }
    
    public boolean CrearDoc(String nombre, ListaVehiculos lista){
        this.nombre = nombre;
        Document documento = null;
        
        try {
            FileOutputStream archivo = new FileOutputStream(this.nombre+".pdf");
            documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();
            
            documento.add(crearTitulo("Listado de vehiculos\n\n"));
            documento.add(crearTabla(lista));
            
            documento.close();
            
        } catch (Exception e) {
        }
        
        
        return false;
    }
    
    private Paragraph crearTitulo(String titulo){
        Font fuente = new Font();
        fuente.setFamily(Font.FontFamily.TIMES_ROMAN.toString());
        fuente.setColor(BaseColor.BLUE);
        fuente.setSize(18);
        fuente.setStyle(Font.BOLDITALIC);
        
        Paragraph parrafo = new Paragraph(titulo, fuente);
        parrafo.setAlignment(1);
        return parrafo;
    }
    
    private PdfPTable crearTabla(ListaVehiculos lista){
        PdfPTable tabla = new PdfPTable(6);
        tabla.addCell(crearCeldaEncabezado("No."));
        tabla.addCell(crearCeldaEncabezado("Marca"));
        tabla.addCell(crearCeldaEncabezado("Linea"));
        tabla.addCell(crearCeldaEncabezado("Modelo"));
        tabla.addCell(crearCeldaEncabezado("Placa"));
        tabla.addCell(crearCeldaEncabezado("Costo"));
        
        int [] dimensiones = {25, 60, 50, 50, 50, 25};
        
        try {
            tabla.setWidths(dimensiones);
        } catch (Exception e) {
        }
        
        agregarDatos(tabla, lista);
        
        return tabla;
    }
    
    private void agregarDatos(PdfPTable tabla, ListaVehiculos lista){
        Vehiculo v;
        int cantidad = lista.canticad();
        
        for (int i = 0; i < cantidad; i++) {
            v = lista.getVehiculos(i);
            
            tabla.addCell(crearCeldaContenido(""+(i+1), i));
            tabla.addCell(crearCeldaContenido(v.getMarca(), i));
            tabla.addCell(crearCeldaContenido(v.getLinea(), i));
            tabla.addCell(crearCeldaContenido(String.valueOf(v.getModelo()), i));
            tabla.addCell(crearCeldaContenido(v.getPlaca(), i));
            tabla.addCell(crearCeldaContenido(String.valueOf(v.getCostoDia()), i));
        }
    }
    
    private PdfPCell crearCeldaEncabezado(String texto){
        Chunk contenido = new Chunk(texto);
        contenido.setFont(new Font(Font.FontFamily.TIMES_ROMAN, 12, Phrase.ALIGN_CENTER, BaseColor.WHITE));
        
        PdfPCell celda = new PdfPCell(new Phrase(contenido));
        celda.setBackgroundColor(BaseColor.BLUE);
        aplicaEstiloCeldas(celda);
//        celda.setBorderColor(BaseColor.BLACK);
//        celda.setBorder(5);
//        celda.setPadding(5);
//        celda.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
//        celda.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
        
        return celda;
    }
    
    private PdfPCell crearCeldaContenido(String texto, int i){
        Chunk contenido = new Chunk(texto);
        contenido.setFont(new Font(Font.FontFamily.TIMES_ROMAN, 12, Phrase.ALIGN_CENTER, BaseColor.BLACK));
        
        PdfPCell celda = new PdfPCell(new Phrase(contenido));
        
        if((i%2)==0) celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        else         celda.setBackgroundColor(BaseColor.GRAY);
        
        aplicaEstiloCeldas(celda);
        
        return celda;
    }
    
    private void aplicaEstiloCeldas(PdfPCell celda){
        celda.setBorderColor(BaseColor.BLACK);
        celda.setBorder(5);
        celda.setPadding(5);
        celda.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        celda.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
    }
    
}
