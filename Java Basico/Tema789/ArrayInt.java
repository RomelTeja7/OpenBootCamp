package JavaBasicTheme.theme789;

import java.util.ArrayList;

public class ArrayInt {

    public static void main(String[] args) {
        ArrayList<Integer> entero = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                entero.add(i);
            }
        }
        System.out.println(entero);

    }
}
