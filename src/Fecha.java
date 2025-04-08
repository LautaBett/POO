public class Fecha {
    private int año;
    private int mes;
    private int dia;


    public Fecha(int año, int mes, int dia){
        this.año=año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
}
