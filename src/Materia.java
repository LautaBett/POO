import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private int cuatri;
    private Docente docente;

    public Materia(String nombre,int cuatri,Docente docente){
        this.cuatri = cuatri;
        this.nombre = nombre;
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public int getCuatri() {
        return cuatri;
    }
}
