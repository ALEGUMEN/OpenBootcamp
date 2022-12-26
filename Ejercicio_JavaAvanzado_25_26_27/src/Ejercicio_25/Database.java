package Ejercicio_25;

import java.util.ArrayList;

public class Database implements DatabaseStore{
    ArrayList<Vehiculo> vehiculos= new ArrayList<>();

    @Override
    public ArrayList<Vehiculo> listarTodos() {
        return vehiculos;
    }

    @Override
    public Vehiculo obtener(String  nombre) {
        for(Vehiculo n1: vehiculos){
            if (n1.nombre.equalsIgnoreCase(nombre)){
                return n1;
            }
        }
        return null;
    }

    @Override
    public void guardar(Vehiculo vehiculo) {
        if (vehiculo!= null){
            vehiculos.add(vehiculo);
        }
    }

    @Override
    public void eliminar(Vehiculo vehiculo) {
        for(Vehiculo n1: vehiculos){
            if (n1.equals(vehiculo)){
                vehiculos.remove(vehiculo);
            }
        }

    }
}

