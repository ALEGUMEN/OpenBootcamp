package Ejercicio_25;

import java.util.ArrayList;

public interface DatabaseStore {
    void guardar(Vehiculo vehiculo);
    ArrayList<Vehiculo> listarTodos();
    Vehiculo obtener(String nombre);
    void eliminar(Vehiculo vehiculo);
}
