package Ejercicio_25;

        /** Continúa con el proyecto de los anteriores ejercicios ahora se va a trabajar sobre
           * las letras I y D de los principios SOLID, deberás:
           * Si no has creado interfaces ya, créalas siguiendo el principio de segregación de interfaz (I)
           * el cual indica que las interfaces grandes se deben segregar en varias interfaces pequeñas.
           * Si ya las has creado, modifícalas para que cumplan el principio.
           * Deberás crear una conexión a base de datos aplicando el último principio de la inversión de dependencias (D).
         **/

public class Main {
            public static void main(String[] args) {
                Vehiculo auto= new Coche(140, "CR-V","Roja", "Combustion");
                auto.acelerar();

                Vehiculo hibrido= new Hibrido(120,"Civic", "Verde", "Electrico/Combustion");
                hibrido.acelerar();
                hibrido.acelerar();

                Vehiculo Tesla= new cocheElectrico(110,"Tesla", "Negro", "Electrico");
                Tesla.frenar();
                Tesla.frenar();

                Vehiculo Suzuki= new Combustible(140, "Suzuki","Plateado", "Combustion");
                Suzuki.frenar();

                DatabaseStore db= new Database();
                db.guardar(auto);
                db.guardar(hibrido);
                db.guardar(Tesla);
                db.guardar(Suzuki);

                System.out.println(db.listarTodos());
                db.eliminar(Tesla);
                System.out.println(db.listarTodos());
            }
}
