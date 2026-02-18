/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.restaurante;

/**
 *
 * @author gilda
 */
public class Mesa {
    private int capacidad, numero;
    private boolean ocupada;

    public Mesa(int numero, boolean ocupada) {
        this.numero = numero;
        this.ocupada = ocupada;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public String toString() {
        return "Mesa{" + "capacidad=" + capacidad + ", numero=" + numero + ", ocupada=" + ocupada + '}';
        
          }

    public void ocupar() {
        this.ocupada=true;
    }

    public void liberar() {
        this.ocupada=false;
    }

    
    
}
