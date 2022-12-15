public class theme5Exercise {

    public interface CocheCRUD {

        void save();

        void delete();

        void findAll();
    }

    public static class cocheCRUDImpl implements CocheCRUD {

        @Override
        public void save() {
        }

        @Override
        public void delete() {
        }

        @Override
        public void findAll() {
        }
        String save = "Se ha guardado";
        String delete = "Se ha borrado";
        String findAll = "Se esta buscando";

        @Override
        public String toString() {
            return "cocheCRUDImpl{" + "save=" + save + ", delete=" + delete + ", findAll=" + findAll + '}';
        }
    }
    public static void main(String[] args) {
        CocheCRUD coche = new cocheCRUDImpl();
        System.out.println(coche);
        
    }
}
