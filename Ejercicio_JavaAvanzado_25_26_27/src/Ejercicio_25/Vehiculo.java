package Ejercicio_25;

public abstract class Vehiculo implements MetodosCoche {

    public int velocidad;
    public String nombre;
    public String color;
    public String modelo;

    public Vehiculo(int velocidad, String nombre, String color, String modelo) {
        this.velocidad = velocidad;
        this.nombre = nombre;
        this.color = color;
        this.modelo = modelo;
    }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
