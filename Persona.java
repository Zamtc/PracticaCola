package Ejercicio;
public class Persona {
    private String codigo,nombre;
    private double tarifa;
    private int horas;

    public Persona(){
        
    }
    public Persona(String cod, String nom, double tarifa, int horas) {
        this.codigo = cod;
        this.nombre = nom;
        this.tarifa = tarifa;
        this.horas = horas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
 public double hallarSueldo(){
        double sueldo;
        sueldo=tarifa*horas;
        return sueldo;
    }
    
    public void mostrarSueldo(){
        System.out.println("Sueldo: "+hallarSueldo());
    }
    
    public String Cadena(){
        return "Código: "+codigo+" Nombre: "+nombre+" Tarifa: "+tarifa+" Horas: "+horas+" Sueldo: "+ hallarSueldo();
    }
   
}

