package Singleton;

public class Main {
    public static void main (String []args){
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(20);
        System.out.println(singleton.getContador());
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(10);
        System.out.println(singleton2.getContador());
        System.out.println(singleton2);

        System.out.println("Valor: " +singleton.getContador()+ " en memoria: " + singleton);
        System.out.println("Valor: " +singleton2.getContador()+ " en memoria: " + singleton2);

        Aplication app = Aplication.getInstance();
        Aplication app2 = Aplication.getInstance();

        app.Run();
        app2.Run();
        System.out.println(app + " " + app2);


    }
}
