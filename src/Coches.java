
import java.io.Serializable;

public class Coches extends Vehiculo implements Serializable {

    public double ancho;
    public double alto;
    public static int identificadorTipo = 0; // Todos los coches tienen el identificador 0
    public static final long serialVersionUID = 975893307349401566L; // Estableciendo un numero fijo evitamos posibles errores en serializacion por no coincidir valor

    public Coches(String matricula, boolean abono, double ancho, double alto) {
        super(matricula, abono);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    double calcularImporte(double min) {
        /*
         Alto * ancho > 8 → minutos * 3.5 € / 60 
         Alto * ancho ≤ 8 → minutos * 2.5 € / 60
         */
        double tamaño = this.alto * this.ancho;
        double total = 0;
        if (tamaño > 8) {
            total = min * 3.5 / 60;
        }
        if (tamaño <= 8) {
            total = min * 2.5 / 60;
        }
        if (super.isAbono()) { // Si es abono aplico descuento de 40 %
            total = total - (total * 0.4);
        }
        total = Math.rint(total * 100) / 100; // Para que solo calcule hasta 2 tres decimales
        return total;
    }

    @Override
    double anchoOruedas() {
        double ancho = 0;
        ancho = this.ancho;
        return ancho;
    }

    @Override
    double alto() {
        double alto = 0;
        alto = this.alto;
        return alto;
    }

    @Override
    public int getIdentificador() {

        return identificadorTipo;

    }

    @Override
    public String toString() {
        return "Coche: " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
