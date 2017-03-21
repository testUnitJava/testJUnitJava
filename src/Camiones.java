
import java.io.Serializable;

public class Camiones extends Vehiculo implements Serializable {

    public int ruedas;
    public static int identificadorTipo = 1; // Todos los camiones tienen el identificador 1 
    public static final long serialVersionUID = -3331041122938969862L; // Estableciendo un numero fijo evitamos posibles errores por no coincidir

    public Camiones(String matricula, boolean abono, int ruedas) {
        super(matricula, abono);
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    double calcularImporte(double min) {
        int ruedas1 = this.ruedas;
        double total = 0;
        if (ruedas1 > 6) {
            total = min * 3.5 * (ruedas1 / 3) / 60;
        }
        if (ruedas1 <= 6) {
            total = min * 7 / 60;
        }
        if (super.isAbono()) {
            total = total - (total * 0.4);
        }
        total = Math.rint(total * 100) / 100;// Para que solo calcule hasta 2 tres decimales 
        return total;
    }

    @Override
    double anchoOruedas() {
        double ruedas = 0;
        ruedas = this.ruedas;
        ruedas = Math.rint(ruedas * 1) / 1;
        return ruedas;
    }

    @Override
    double alto() {
        return 0;
    }

    @Override
    public int getIdentificador() {

        return identificadorTipo;

    }

    @Override
    public String toString() {
        return "Camion: " + super.toString();
    }
}
