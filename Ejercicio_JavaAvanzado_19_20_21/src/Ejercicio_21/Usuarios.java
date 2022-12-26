package Ejercicio_21;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {

    private final String ficheroDatos;

    public Usuarios(String ficheroDatos) {
        this.ficheroDatos = ficheroDatos;
    }

    private  ArrayList<Usuario> usuarios = new ArrayList();

    public ArrayList<Usuario> listarUsuarios() {

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.setNombreUsuario(partes[0]);
                usuario.setNombre(partes[1]);
                usuario.setApellidos(partes[2]);
                usuario.setEmail(partes[3]);
                usuario.setNivelAcceso(Integer.parseInt(partes[4]));

                usuarios.add(usuario);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error"+ e.getMessage());
        }

        return usuarios;
    }

    public Usuario obtenerUsuario(String username) {
        ArrayList<Usuario> usuarios= listarUsuarios();
        for (Usuario usuarioActual: usuarios) {
            if (usuarioActual.getNombreUsuario().equalsIgnoreCase(username)){
                return usuarioActual;
            }

        }
        return null;
    }

    public void crearUsuario(Usuario usuario) {
        if (obtenerUsuario(usuario.getNombreUsuario())!=null){
            return;
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Usuario usuarioExistente : listarUsuarios()) {
                printStream.println(SepararPorComas(usuarioExistente));
            }

            printStream.println(SepararPorComas(usuario));
        } catch (Exception e) {

        }
    }
    private String SepararPorComas(Usuario usuario){
        return usuario.getNombreUsuario() + ","
                + usuario.getNombre() + ","
                + usuario.getApellidos() + ","
                + usuario.getEmail() + ","
                + usuario.getNivelAcceso();
    }
    public void borrarUsuario(String username) {
        ArrayList<Usuario> usuarios= listarUsuarios();

        for (int i =0; i< usuarios.size();i++) {
            if (usuarios.get(i).getNombreUsuario().equalsIgnoreCase(username)){
                usuarios.remove(i);
            }

        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Usuario usuarioActual : usuarios) {
                printStream.println(SepararPorComas(usuarioActual));
            }
        } catch (Exception e) {
        }
    }
}
