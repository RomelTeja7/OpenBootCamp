package JavaBasicTheme.theme789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

public class SystemMain {

    public static void main(String[] args) {
        //Ingreso de array con datos de recorrido en for y datos del hashmap ingresados a un txt.
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        HashMap<String, String> pais = new HashMap<String, String>();
        pais.put("San Salvador", "El Salvador");
        pais.put("C.D Mexico", "Mexico");
        try {
            InputStream in = new FileInputStream("D:\\Documentos\\NetBeans\\JavaBasic\\src\\main\\java\\JavaBasicTheme\\theme789\\fileIn.txt");
            byte [] data = in.readAllBytes();
            PrintStream out = new PrintStream("D:\\Documentos\\NetBeans\\JavaBasic\\src\\main\\java\\JavaBasicTheme\\theme789\\fileOuts.txt");
            out.println(nums);
            out.println(pais);
            out.write(data);
            out.close();
            System.out.println("Se realizo correctamente");
        } catch (Exception e) {
            System.out.println("No se pudo ingresar la matriz. " + e.getMessage());
        }
    }
}
