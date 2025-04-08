import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    protected String cargo;
    protected String dedicacion;
    protected List<Materia> materias;

    public Docente(String nombre, String apellido, int dni, String mail, String cargo, String dedicacion) {
        super(nombre, apellido, mail, dni);
        this.cargo = cargo;
        this.dedicacion = dedicacion;
        this.materias = new ArrayList<>();
    }

    public String getCargo() {
        return cargo;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public List<Materia> getMaterias() {
        List<Materia> copy = new ArrayList<Materia>(materias);
        return copy;
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }
}