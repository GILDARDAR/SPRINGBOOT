/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.restaurante;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author gilda
 */
public class Restaurante {
    private String nombre, direccion;
    private List<Mesa> mesas;
    private List<Pedido> pedidos = new ArrayList<>();
    public Restaurante() {
        this.mesas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "nombre=" + nombre + ", direccion=" + direccion + ", mesas=" + mesas + '}';
    }

    public void agregarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }
    
    public Mesa buscarMesaPorNumero(int num) {
        Mesa m=null;
        for (Mesa mesa : mesas) {
            if (mesa.getNumero()==num) {
                m = mesa;
            }
        }
        return m;
    }
    public List<Mesa> obtenerMesasDisponibles() {
        List<Mesa> mesas = new ArrayList<>();
        for (Mesa mesa : this.getMesas()) {
            if (!mesa.isOcupada()) {
                mesas.add(mesa);
            }
            
        }
        return mesas;
    }
    public double calcularTotalDia() {
        double total=0;
        for (Pedido pedido : pedidos) {
            total=total+pedido.total;
        }
        return total;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
}
