
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Aparcamiento implements Serializable {

    public HashMap<String, Vehiculo> parking = new HashMap<String, Vehiculo>();
    private int capacidad;
    public int contador = 0;
    public static final long serialVersionUID = -1065223737403425393L; // Estableciendo un numero fijo evitamos posibles errores por no coincidir

    public Aparcamiento(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getContador() {
        return contador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void introducirVehiculo(Vehiculo v) {
        if (!parking.containsKey(v.getMatricula()) && parking.size() <= this.capacidad - 1) { // capacidad-1 porque parking empieza desde 0 y  guarda objetos en esa posicion
            parking.put(v.getMatricula(), v);
            contador = this.capacidad - parking.size();
        }

    }

    public String sacarVehículo(String matricula) {
        double total = 0;
        long min = 0;
        GregorianCalendar fechasalida = new GregorianCalendar();
        long fsalida = fechasalida.getTimeInMillis();
        if (parking.containsKey(matricula)) {
            Vehiculo v = parking.get(matricula);
            long fentrada = v.getMinutos();
            min = (fsalida - fentrada) / (60 * 1000);//Obtenemos los minutos totales
            total = v.calcularImporte(min);
            parking.remove(matricula);
            contador = this.capacidad - parking.size();
            // System.out.println("la matricula "+matricula+" fue removido y el importe a pagar es "+total+" Euros");
        }
        return String.valueOf(total) + " Euros";
    }

    @Override
    public String toString() {
        return "Aparcamiento "+parking; 
    }

}
