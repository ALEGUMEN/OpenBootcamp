package Ejercicio_22;

public class CocheHibrido extends CocheMejorado{
    int consumoCH;
    int cargaActual;
    String tipoCombustible;
    int ltEnDeposito;
    int consumoCombustible;


    private CocheHibrido(){}

    public CocheHibrido(int consumoCH, int cargaActual, String tipoCombustible, int ltEnDeposito, int consumoCombustible) {
        this.consumoCH = consumoCH;
        this.cargaActual = cargaActual;
        this.tipoCombustible = tipoCombustible;
        this.ltEnDeposito = ltEnDeposito;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public void arrancar() {
        if (!estaArrancado){
            System.out.println("Arrancando Coche Híbrido");
            estaArrancado = true;
        }else{
            System.out.println("El coche híbrido ya estaba arrancado");
        }
    }

    @Override
    public void apagar() {
        if (!estaArrancado){
            System.out.println("El coche híbrido ya estaba apagado.");
        }else{
            System.out.println("Apagando coche híbrido");
            estaArrancado = false;
        }
    }

    @Override
    public int kmEstimados() {
        return ((cargaActual / consumoCH) + (ltEnDeposito / consumoCombustible)) * 100;
    }

}
