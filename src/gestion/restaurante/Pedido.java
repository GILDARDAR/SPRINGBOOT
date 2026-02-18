/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.restaurante;

/**
 *
 * @author gilda
 */
public class Pedido {
    int id;
    double total;
    String descripcion;

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", total=" + total + ", descripcion=" + descripcion + '}';
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
    
    
    
}
