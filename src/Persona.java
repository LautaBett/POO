public abstract class Persona extends Targeta{
    protected String email;

    public Persona(String email, String nombre, String apellido, int dni){
        super(nombre, apellido, dni);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }



}
