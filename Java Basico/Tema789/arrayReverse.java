package JavaBasicTheme.theme789;

public class arrayReverse {
        public static void main(String[] args) {
        reverse("Hola mundo");
    }
    
    public static String reverse(String texto) {
        char []inv = texto.toCharArray();
        int count;
        for (count = texto.length()-1; count >= 0; count--) {
            System.out.print(""+ inv[count]);
        }      
        return texto;
    }
}
