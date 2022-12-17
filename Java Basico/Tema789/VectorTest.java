package JavaBasicTheme.theme789;

import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {
        Vector vec = new Vector();

        vec.addElement("Hola");
        vec.addElement("Soy");
        vec.addElement("Romel");
        vec.addElement("Es");
        vec.addElement("Prueba");

        vec.removeElement(vec.get(1));
        vec.removeElement(vec.get(2));
        
        System.out.println(vec);
        
        //El problema para añadir 1k de elementos, seria la sobrecarga que provocaria
    }

}
