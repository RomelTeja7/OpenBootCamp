public class SmartDevice {

    public static void main(String[] args) {

        SmartWatch watch2 = new SmartWatch("Apple Watch", "Apple", "Negro", 699.95, "IOS", "Cuero negro", "cardiaco, pasos");
        SmartPhone phone2 = new SmartPhone("Iphone 14", "Apple", "Blanco", 1199.99, "IOS", 7.0, "40px", "128GB");
        System.out.println(watch2);
        System.out.println(phone2);
    }

    static class SmartWatch {

        private String modelo;
        private String marca;
        private String color;
        private Double precio;
        private String sistema;
        private String sensores;
        private String correaMaterial;

        @Override
        public String toString() {
            return "SmartWatch{" + "modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", precio=" + precio + ", sistema=" + sistema + ", sensores=" + sensores + ", correaMaterial=" + correaMaterial + '}';
        }

        public SmartWatch() {
        }

        public SmartWatch(String modelo, String marca, String color, Double precio, String sistema, String sensores, String correaMaterial) {
            this.modelo = modelo;
            this.marca = marca;
            this.color = color;
            this.precio = precio;
            this.sistema = sistema;
            this.sensores = sensores;
            this.correaMaterial = correaMaterial;
        }

    }

    static class SmartPhone {

        private String modelo;
        private String marca;
        private String color;
        private Double precio;
        private String sistema;
        private Double tamano;
        private String camara;
        private String espacio;

        public SmartPhone() {
        }

        public SmartPhone(String modelo, String marca, String color, Double precio, String sistema, Double tamano, String camara, String espacio) {
            this.modelo = modelo;
            this.marca = marca;
            this.color = color;
            this.precio = precio;
            this.sistema = sistema;
            this.tamano = tamano;
            this.camara = camara;
            this.espacio = espacio;
        }

        @Override
        public String toString() {
            return "SmartPhone{" + "modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", precio=" + precio + ", sistema=" + sistema + ", tamano=" + tamano + ", camara=" + camara + ", espacio=" + espacio + '}';
        }

    }
}
