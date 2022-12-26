package Ejercicio_21;
/**
 * Teniendo en cuenta lo visto en la sesión 21, utiliza un proyecto de los trabajados y límpialo.
 * Si encuentras código duplicado, elimínalo y realiza la minificación de las clases y métodos.
 * se mejoró el pasaje de argumentos pasando un solo fichero y con ello se mejoró la gestión usuarios
 */
public class Main {
    public void main(String args) {

        Usuarios usuarios = new Usuarios(args);
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("MiguelLL");
        usuario.setNombre("Miguel");
        usuario.setApellidos("Lopez Lopez");
        usuario.setEmail("miguel@open-bootcamp.com");
        usuario.setNivelAcceso(1);


        usuarios.crearUsuario(usuario);

        Usuario usuario2 = new Usuario();
        usuario.setNombreUsuario("MariaGG");
        usuario.setNombre("Maria");
        usuario.setApellidos("Gutiérrez");
        usuario.setEmail("maria@open-bootcamp.com");
        usuario.setNivelAcceso(2);
        usuarios.crearUsuario(usuario2);

        Usuario openbootcamp = usuarios.obtenerUsuario("MariaGG");
        System.out.println(openbootcamp.getEmail());

        usuarios.borrarUsuario("MariaGG");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println(a.getNombreUsuario());
        }
    }
}
