/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.restaurante;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author gilda
 */
public class GestionRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurante r= new Restaurante();
        r.setNombre("Sofipan ");
        r.setDireccion("Calle ayala 59");
        Mesa m= new Mesa(1, true);
        m.setCapacidad(2);
        Mesa m2= new Mesa(2, true);
        m2.setCapacidad(2);
        Mesa m3= new Mesa(3, false);
        m3.setCapacidad(2);
        m3.ocupar();
        Mesa m4= new Mesa(4, true);
        m.setCapacidad(2);
        m3.liberar();
        Mesa m5= new Mesa(5, false);
        m.setCapacidad(5);
        r.agregarMesa(m);
        r.agregarMesa(m2);
        r.agregarMesa(m3);
        r.agregarMesa(m4);
        r.agregarMesa(m5);
        //System.out.println(">>> "+r);
        r.getPedidos().add(new Pedido(r.getPedidos().size()+1,10,"primera venta"));
        r.getPedidos().add(new Pedido(r.getPedidos().size()+1,24,"segunda venta"));
        r.getPedidos().add(new Pedido(r.getPedidos().size()+1,5,"tercera venta"));
        LocalDate ld= LocalDate.of(2026, 3, 4);
        r.getPedidos().get(0).setFecha(ld);
        ld= LocalDate.of(2026, 2, 1);
        r.getPedidos().get(1).setFecha(ld);
        ld= LocalDate.of(2026, 3, 4);
        r.getPedidos().get(2).setFecha(ld);
        
        System.out.println(r.obtenerMesasDisponibles()+ " total de ventas: "+r.calcularTotalDia());
        System.out.println("mesas del dia: "+r.getPedidosHoy());
        System.out.println("total facturacion: "+r.getFacturacionHoy());
          
    }
    
}
