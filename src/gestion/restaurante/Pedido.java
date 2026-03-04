/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.restaurante;

import java.time.LocalDate;

/**
 *
 * @author gilda
 */
public class Pedido {
    int id;
    double total;
    String descripcion;
    LocalDate fecha;
    Double iva;

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", total=" + total + ", descripcion=" + descripcion + ", fecha=" + fecha + ", iva=" + iva + '}';
    }



    public void getIva(double porcent){ 
        iva=total*(porcent/100);
        
    }

    public Pedido(int id, double total, String descripcion) {
        this.id = id;
        this.total = total;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }
    
    
    
}
