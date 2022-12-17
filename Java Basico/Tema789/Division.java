package JavaBasicTheme.theme789;

public class Division {

    public static void main(String[] args) {

        try {
            System.out.println(DividePorCero(6, 0));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }

    }

    public static int DividePorCero(int numA, int numB) throws ArithmeticException {
        int div = numA / numB;
        return div;
    }
}
