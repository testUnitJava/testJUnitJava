
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Vehiculo implements Serializable {

    private String matricula;
    private boolean abono;
    private String sino;// Para que en lugar de true o false nos diga si o no
    private GregorianCalendar fecha = new GregorianCalendar();
    private Date fecha1 = fecha.getTime();
    public static final long serialVersionUID = 2383344721455151163L;// Estableciendo un numero fijo evitamos posibles errores en serializacion por no coincidir valor
    private Coches coche;

    //Constructor
    public Vehiculo(String matricula, boolean abono) {
        this.matricula = matricula;
        this.abono = abono;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getFecha() {
        return fecha1.toLocaleString();
    }

    public long getMinutos() {
        long fentrada = 0;
        fentrada = fecha.getTimeInMillis();
        return fentrada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAbono() {
        return abono;
    }

    public String siono() {
        String valor = "";
        if (this.abono) {
            valor = "Si";
        } else {
            valor = "No";
        }
        return valor;

    }

    public void setAbono(boolean abono) {
        this.abono = abono;
    }

    abstract double calcularImporte(double min);

    abstract double anchoOruedas();
    abstract double alto();

    public int getIdentificador() {
        int identificadorTipo = coche.getIdentificador();
        return identificadorTipo;

    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + " Abono: " + siono() + " Fecha: " + fecha1.toLocaleString(); //To change body of generated methods, choose Tools | Templates.
    }

}
