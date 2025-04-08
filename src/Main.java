public class Main {
    public static void main(String[] args) {
        // Crear un docente
        Docente docente = new Docente("Laura", "González", 12345678, "laura@mail.com", "Adjunta", "Simple");

        // Crear una materia y asignarle el docente
        Materia materia = new Materia("Programación I", 1, docente);
        docente.addMateria(materia);

        // Crear una fecha de ingreso y un alumno
        Fecha fechaIngreso = new Fecha(2022, 3, 15);
        Alumno alumno = new Alumno("maria@mail.com", "María", "Pérez", 11222333, 1001, fechaIngreso);

        // Crear una carrera y agregar alumno, materia y docente
        Carrera carrera = new Carrera("Ingeniería en Sistemas", 5);
        Carrera carrera2 = new Carrera("ingenieria en pepitos", 3);
        carrera.addAlumnos(alumno);
        carrera2.addAlumnos(alumno);
        carrera.addDocente(docente);
        carrera.addMateria(materia);

        // Crear el sistema y registrar la carrera
        Sistema sistema = new Sistema();
        sistema.addCarrera(carrera);
        sistema.addCarrera(carrera2);

        // Verificar qué carreras cursa el alumno
        System.out.println("Carreras en las que está inscrito " + alumno.getNombre() + ":");
        for (Carrera c : sistema.ListaDeCarreras(alumno)) {
            System.out.println("- " + c.getNombre());
        }

        // Generar y mostrar la "targeta" (tarjeta) del alumno
        Targeta t = sistema.generarTargeta(alumno);
        System.out.println("\nDatos de la targeta:");
        System.out.println("Nombre: " + t.getNombre());
        System.out.println("Apellido: " + t.getApellido());
        System.out.println("DNI: " + t.getDni());
    }
}
