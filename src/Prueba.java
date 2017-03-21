/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coches c1 = new Coches("matriculados", true, 2, 8.5);
        Coches c3 = new Coches("maiculados", true, 2, 8.5);
        Coches c4 = new Coches("triculados", true, 2, 8.5);
        Coches c5 = new Coches("maiculadddddddos", true, 2, 8.5);
        System.out.println(c1.calcularImporte(14) + " Euros");
        System.out.println(c1.toString());
        Camiones c2 = new Camiones("matric1212ula", true, 4);
        System.out.println(c2.calcularImporte(30) + " Euros");
        System.out.println(c2.toString());
        Aparcamiento a1 = new Aparcamiento(5);
        a1.introducirVehiculo(c2);
        a1.introducirVehiculo(c3);
        a1.introducirVehiculo(c4);
        a1.introducirVehiculo(c5);
        System.out.println(a1.parking.get("nuevo"));
        a1.introducirVehiculo(c1);// no se agrega porque tiene misma matricula
        System.out.println("Queda " + a1.getContador() + " puestos libres");
        a1.sacarVehículo("matricula");
        System.out.println("Queda " + a1.getContador() + " puestos libres");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        String parking1[] = new String[3000];
       
    }

}
