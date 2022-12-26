package Ejercicio_22;

        /**Durante estos ejercicios se va a trabajar sobre las letras S, O y L de los principios SOLID, deberás:
        Crea una clase coche aplicándole el principio de responsabilidad única (S).
        Continúa con el código extendiéndolo para aumentar su funcionalidad pero sin modificarlo
        aplicando el principio abierto/cerrado(O).
        Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible y uno híbrido y
         aplica el principio de substitución de Liskov (L), las subclases deben ser sustituibles por la superclase coche
         **/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList();

        /**Principio de Liskov**/
        //Instanciando objetos de cada clase Coche con la clase hija "CocheMejorado"
         //Ej. CocheMejorado electrico = new CocheElectrico(20, 80);

        //Instanciando objetos de la clase padre "Coche":
         //Ej. Coche hibrido = new CocheHibrido(20, 80);

        //Instanciando objetos de las clases hijas:
        CocheElectrico electrico = new CocheElectrico(20, 80);
        CocheHibrido hibrido = new CocheHibrido(20, 50, "Gasolina", 30, 8);
        CocheCombustion combustion = new CocheCombustion("Diésel", 8, 30);
        ////////////////////////////////////////////////////////////////////
        //Inicializo valores de la clase Coche para comprobar que se puede acceder y modificar
        electrico.marca = "Tesla";
        electrico.matricula = "483975F";
        electrico.modelo = "T";
        electrico.añoMatriculacion = 2016;

        hibrido.marca = "Toyota";
        hibrido.modelo = "Accord";
        hibrido.matricula = "4398HJK";
        hibrido.añoMatriculacion = 2018;

        combustion.marca = "Volkswagen";
        combustion.modelo = "Jetta";
        combustion.matricula = "45893HJK";
        combustion.añoMatriculacion = 2006;

        coches.add(electrico);
        coches.add(hibrido);
        coches.add(combustion);

        //Estado arrancado o no
        for(Coche cocheActual : coches){
            System.out.println("El coche marca: " + cocheActual.marca + " ¿Esta arrancado? " + cocheActual.estaArrancado);
        }

        // Para comprobar que el estado de uno no afecta los demas coches
        combustion.arrancar();
        //Arrancamos todos los coches
        System.out.println("\n-Arrancando todos los coches.");
        for(Coche cocheActual : coches){
            cocheActual.arrancar();
        }

        //km que recorre cada coche  según (nivel de tanque, consumo,  y/o batería)
        System.out.println("\n-¿Cuantos km le quedan a cada coche?");
        for(Coche cocheActual : coches){
            System.out.println("El coche marca: " + cocheActual.marca + " puede recorrer "
                    + cocheActual.kmEstimados() + " kms aproximados");
        }

        // Para comprobar que el estado de uno no afecta los demas coches
        System.out.println("\n-Arrancando todos los coches.");
        for(Coche cocheActual : coches){
            cocheActual.arrancar();
        }

        //Apagamos todos los coches
        System.out.println("\n-Apagando todos los coches.");
        for(Coche cocheActual : coches){
            cocheActual.apagar();
        }

        //Apagamos todos los coches de nuevo  para comprobar que sucede
        System.out.println("\n--Tratando de apagar todos los coches.");
        for(Coche cocheActual : coches){
            cocheActual.apagar();
        }

    }
}
