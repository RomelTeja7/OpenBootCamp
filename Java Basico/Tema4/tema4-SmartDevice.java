public class SmartDevice {
        String modelo = "";
        String marca = "";
        String color = "";
        Double precio ;
        String sistema = "";

    public SmartDevice() {
    }
        
    public SmartDevice(String modelo, String marca, String color, Double precio, String sistema){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.sistema =  sistema;
    }
        
    public static void main(String[] args) {
        SmartWatch watch2 = new SmartWatch("Apple Watch", "Apple", "Negro", 699.95, "IOS", "Cuero negro", "cardiaco, pasos");
        SmartPhone phone2 = new SmartPhone("Iphone 14", "Apple", "Blanco", 1199.99, "IOS", 7.0, "40px", "128GB");
        
        System.out.println(watch2);
        System.out.println(phone2);

    }

    static class SmartWatch extends SmartDevice{

        String sensores = "";
        String correaMaterial = "";
        
        public SmartWatch() {
            
        }

        @Override
        public String toString() {
            return "SmartWatch{" + "sensores=" + sensores + ", correaMaterial=" + correaMaterial + '}';
        }

        public SmartWatch(String modelo, String marca, String color, Double precio, String sistema, String sensores, String correaMaterial){
            super(modelo, marca, color, precio, sistema);
            this.sensores = sensores;
            this.correaMaterial = correaMaterial;
        }
        

    }

    static class SmartPhone extends SmartDevice{

        Double tamano;
        String camara = "";;

        @Override
        public String toString() {
            return "SmartPhone{" + "tamano=" + tamano + ", camara=" + camara + ", espacio=" + espacio + '}';
        }
        String espacio = "";;

        public SmartPhone() {
            
        }

        public SmartPhone(String modelo, String marca, String color, Double precio, String sistema, Double tamano, String camara, String espacio) {
            super(modelo, marca, color, precio, sistema);
            this.tamano = tamano;
            this.camara = camara;
            this.espacio = espacio;
        }
        
    }
}
