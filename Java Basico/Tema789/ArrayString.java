package JavaBasicTheme.theme789;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayString {

    public static void main(String[] args) {
        
        ArrayList<String> pais = new ArrayList<String>();
        pais.add("España");
        pais.add("El Salvador");
        pais.add("Colombia");
        pais.add("Mexico");
        System.out.println(pais);
        
        List<String> linkendList = new LinkedList<String>();
        linkendList.addAll(pais);
        System.out.println(linkendList);
    }
}
