import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Carrera> carreras;

    public Sistema(){
        this.carreras = new ArrayList<>();
    }

    public List<Carrera> getCarreras() {
        List<Carrera> copy = new ArrayList<Carrera>(carreras);
        return copy;
    }

    public void addCarrera(Carrera carrera){
        this.carreras.add(carrera);
    }

    public List<Carrera> ListaDeCarreras(Persona buscada){
        List<Carrera> resultado = new ArrayList<>();
        for(Carrera una : carreras){
             List<Alumno> listaAlumno = una.getAlumnos();
             for (Alumno uno : listaAlumno){
                int dni = uno.getDni();
                if (dni == buscada.getDni())
                    resultado.add(una);
            }
        }
        return resultado;
    }

    public Targeta generarTargeta(Persona x){
        String nombre = x.getNombre();
        String apellido = x.getApellido();
        int dni = x.getDni();
        Targeta resultado = new Targeta(nombre,apellido,dni);
        return resultado;
    }

}
