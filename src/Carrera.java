import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private int duracion;
    private List<Materia> materias;
    private List<Alumno> alumnos;
    private List<Docente> docentes;

    public Carrera(String nombre, int duracion){
        this.nombre = nombre;
        this.duracion = duracion;
        this.alumnos = new ArrayList<>();
        this.materias = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public List<Alumno> getAlumnos() {
        List<Alumno> copy = new ArrayList<Alumno>(alumnos);
        return copy;
    }

    public List<Docente> getDocentes() {
        List<Docente> copy = new ArrayList<Docente>(docentes);
        return copy;
    }

    public List<Materia> getMaterias() {
        List<Materia> copy = new ArrayList<Materia>(materias);
        return copy;
    }

    public void addAlumnos(Alumno alumno) {
        this.alumnos.add(alumno);
    }
    public void addDocente(Docente docente){
        this.docentes.add(docente);
    }
    public void addMateria(Materia materia){
        this.materias.add(materia);
    }
}

