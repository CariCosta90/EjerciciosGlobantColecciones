package mascotaapp.entities;

public class Mascota {

    //Atributos
    private String nombre;
    private String apodo;
    //conejo, gaot, perro, loro...
    private String tipo;
    private int edad;
    private boolean cola;
    private String raza;
    private String color;
    private int energia;

    //Constructores 
    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String raza, String color, int energia) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.color = color;
        this.energia = energia;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + '}';
    }
    
    

}
