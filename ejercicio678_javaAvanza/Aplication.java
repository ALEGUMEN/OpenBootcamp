package Singleton;

public class Aplication {

    private static Aplication aplication;
    boolean isRunning = false;

    private Aplication(){}

    public static Aplication getInstance(){
        if (aplication == null) {
            aplication = new Aplication ();
        }
        return aplication;
    }

    public void Run() {
        if(!isRunning){
            isRunning = true;
        }else{
            System.out.println("Ya estaba en ejecución");
        }
    }
}
