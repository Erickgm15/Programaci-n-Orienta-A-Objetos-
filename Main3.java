public class Main3 {
public static void main(String[] args) {

    // Usuario
    Usuario usuario1 = new Usuario("Erick Alexander ", "Garcia Moran ", 16,2008);
    Usuario usuario2 =new Usuario("Javier ", "Tan chacon ", 17, 2007);

    // Metodos del Objeto
    usuario1.mostarDatos();
    usuario2.mostarDatos();
    
    System.out.println(usuario1.getEdad());
    System.out.println(usuario1.getNombre());
    System.out.println(usuario1.getApellido());
    System.out.println(usuario1.getFechaNacimiento());

    if (usuario1.getEdad()>=18) {
        System.out.println("Es mayor de edad ");
    }
}

}