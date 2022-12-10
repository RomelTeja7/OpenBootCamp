public class theme2Exercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el precio");
        Double precio = scan.nextDouble();
        IVA(precio);
    }

    static Double IVA(double precio) {
        double porIVA = 113;
        double total = precio/100 * porIVA;
        System.out.println(total);
        return total;
    }
}
