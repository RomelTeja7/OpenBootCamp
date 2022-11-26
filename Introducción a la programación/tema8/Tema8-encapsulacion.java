public class Tema8Exercises {

    public static void main(String[] args) {

//Para ejemplos de diferentes objetos
        Persona edad = new Persona();
        Persona nombre = new Persona();
        Persona tel = new Persona();

        edad.setEdad(20);
        nombre.setNombre("Romel Tejada");
        tel.setTelefono("1234-4321");
   
//Para ejemplos de unico objeto
        Persona all = new Persona();
        
        all.setEdad(21);
        all.setNombre("Ernesto Pena");
        all.setTelefono("5678-8765");

        System.out.println("Llamandolo desde diferentes objetos");
        System.out.println(edad.getEdad());
        System.out.println(nombre.getNombre());
        System.out.println(tel.getTelefono());
        
        System.out.println("LLamandolo desde el mismo objeto ");
        System.out.println(all.getEdad());
        System.out.println(all.getNombre());
        System.out.println(all.getTelefono());
    }

}

class Persona {

    private int edad;
    private String nombre;
    private String telefono;
  
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
  
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
  
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
}
