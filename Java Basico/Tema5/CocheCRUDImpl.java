public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public Coche save() {
        System.out.println("Save");
        return new Coche();
    }

    @Override
    public Coche delete() {
        System.out.println("Delete");
        return new Coche();
    }

    @Override
    public Coche findAll() {
        System.out.println("Find All");
        return new Coche();
    } 
}
