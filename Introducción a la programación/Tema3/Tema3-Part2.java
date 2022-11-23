/*Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.*/
/*
 * @author Romel
 */
public class Cars {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.puerta();
        System.out.println(miCoche.puertas);
    }
}
class coche {
    int puertas = 4;
    public void puerta() {
        this.puertas++;
    }
}
