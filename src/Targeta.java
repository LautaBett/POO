public class Targeta {
    protected String nombre;
    protected String apellido;
    protected int dni;


    public Targeta(String nombre,String apellido,int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }
}
