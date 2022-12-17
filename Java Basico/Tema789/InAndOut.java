package JavaBasicTheme.theme789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class InAndOut {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("D:\\Documentos\\NetBeans\\JavaBasic\\src\\main\\java\\JavaBasicTheme\\theme789\\fileIn.txt");
            byte []datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream("D:\\Documentos\\NetBeans\\JavaBasic\\src\\main\\java\\JavaBasicTheme\\theme789\\fileOut.txt");
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("No se encontro la locacion");
        }
    }
}
