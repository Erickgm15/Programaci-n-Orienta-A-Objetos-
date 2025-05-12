public class Usuario {
    // Propiedades de objetos 
         private String nombre ;
         private String apellido;
         private int edad ;
        private  int FechaNacimiento;

    // Metodo Constructor 
    public  Usuario( String nombre ,String apeliiodo ,int edad , int FechaNacimiento){
        this.nombre = nombre;
        this.apellido = apeliiodo;
        this.edad = edad;
        this.FechaNacimiento = FechaNacimiento;

    }

    //  Metodos gets 

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getFechaNacimiento(){
        return this.FechaNacimiento;
    }


     // Metodos
     public  void mostarDatos (){

        System.out.println("Nombre:"+ nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Edad :" + edad);
        System.out.println("Fecha de Nacimiento :" + FechaNacimiento);
     }
}