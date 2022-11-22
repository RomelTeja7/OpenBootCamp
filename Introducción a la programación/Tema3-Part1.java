//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

public class TypeFucntion {
    public static void main(String[] args) {
        paramEx(10, 30, 5);
    }
    
    public static int paramEx(int a, int b, int c){
      int  result = a+b+c;
      System.out.println("El total de la suma es: " +result);
      return result;
    }
}
