public class Coche {

    public Coche() {
    }
    public static void main(String[] args) {
        CocheCRUD coche = new CocheCRUDImpl();
        System.out.println(coche.save()+"\n");
        System.out.println(coche.delete()+"\n");
        System.out.println(coche.findAll()+"\n");
    }
   
}
