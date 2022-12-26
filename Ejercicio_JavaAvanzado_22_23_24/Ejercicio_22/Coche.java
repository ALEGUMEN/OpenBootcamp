package Ejercicio_22;
//Se creó la clase coche aplicando el principio de responsabilidad única
public class Coche {
    String modelo;
    String marca;
    String matricula;
    int añoMatriculacion;

    //A continuación adaptación del código a principio de liskov
    boolean estaArrancado = false;
    public void arrancar() {}
    public void apagar() {}
    public int kmEstimados() {return 0;}
}
