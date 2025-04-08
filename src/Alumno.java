public class Alumno extends Persona{
    private int numLegajo;
    private Fecha fechaIngreso;

    public Alumno(String email, String nombre, String apellido, int dni, int numLegajo, Fecha fechaIngreso) {
        super(email, nombre, apellido, dni);
        this.numLegajo = numLegajo;
        this.fechaIngreso = fechaIngreso;
    }

    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    public int getNumLegajo() {
        return numLegajo;
    }
}
