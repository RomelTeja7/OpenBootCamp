public class theme4Exercise {

    public static void main(String[] args) {

        SmartWatch watch = new SmartWatch();
        SmartPhone phone = new SmartPhone();

        //Modelo SmartWatch
        watch.modelo = "Apple Watch";
        watch.marca = "Apple";
        watch.color = "Negro";
        watch.precio = 699.95;
        watch.sistema = "IOS";
        watch.correaMaterial = "Cuero negro";
        watch.sensores = "cardiaco, pasos";
        System.out.println("SmartWatch" + "\n Modelo: " + watch.modelo
                + "\n Marca: " + watch.marca
                + "\n Color: " + watch.color
                + "\n Precio: " + watch.precio
                + "\n Sistema: " + watch.sistema
                + "\n Correa Material: " + watch.correaMaterial
                + "\n Sensores: " + watch.sensores);

        //Modelo SmartPhone
        phone.modelo = "Iphone 14";
        phone.marca = "Apple";
        phone.color = "Blanco";
        phone.precio = 1199.99;
        phone.sistema = "IOS";
        phone.tamano = 7.0;
        phone.camara = "40px";
        phone.espacio = "128GB";
        System.out.println("\nSmartPhone" + "\n Modelo: " + phone.modelo
                + "\n Marca: " + phone.marca
                + "\n Color: " + phone.color
                + "\n Precio: " + phone.precio
                + "\n Sistema: " + phone.sistema
                + "\n Tamaño: " + phone.tamano
                + "\n Camara: " + phone.camara
                + "\n Espacio: " + phone.espacio);
    }

    static class SmartWatch {

        private String modelo;
        private String marca;
        private String color;
        private Double precio;
        private String sistema;
        private String sensores;
        private String correaMaterial;

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

    }
}
