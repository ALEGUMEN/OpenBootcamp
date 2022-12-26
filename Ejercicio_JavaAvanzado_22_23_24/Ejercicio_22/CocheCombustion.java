package Ejercicio_22;

public class CocheCombustion extends CocheMejorado{
    String tipoDeCombustible;
    int consumo;
    int ltEnDeposito
            ;

    private CocheCombustion() {}

    public CocheCombustion(String tipoDeCombustible, int consumo, int ltEnDeposito
    ) {
        this.tipoDeCombustible = tipoDeCombustible;
        this.consumo = consumo;
        this.ltEnDeposito
                = ltEnDeposito
        ;
    }

    @Override
    public void arrancar() {
        if (!estaArrancado){
            System.out.println("Arrancando Coche de combustion");
            estaArrancado = true;
        }else{
            System.out.println("El coche de combustión ya estaba arrancado");
        }
    }

    @Override
    public void apagar() {
        if (!estaArrancado){
            System.out.println("El coche de combustion ya estaba apagado.");
        }else{
            System.out.println("Apagando coche de combustión");
            estaArrancado = false;
        }
    }

    @Override
    public int kmEstimados() {
        return (ltEnDeposito
                / consumo) * 100;
    }
}
