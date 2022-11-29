public class Tema9Exercises {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        //Asignación de datos
        cliente.edad = 20;
        cliente.nombre = "Romel Tejada";
        cliente.tel = "1234-4321";
        cliente.setCredito(80);
        trabajador.setSalario(1000);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Telefono: " + cliente.tel);
        System.out.println("Credito: " + cliente.getCredito());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}

class Persona {

    int edad = 0;
    String nombre = "";
    String tel = "";
}

class Cliente extends Persona {

    private int credito = 0;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {

    private int salario = 0;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
