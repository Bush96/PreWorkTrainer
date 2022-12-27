package Iterator;

public class Test {
    public static void main(String[] args) {
        String[] info = {"test1", "test2", "test3"};
        Profiles profiles = new Profiles("Kek", info);

        Iterator iterator = profiles.getIterator();
        System.out.println(profiles.getName());

        while (iterator.hasNext()){
            System.out.println(iterator.objNext().toString());
        }
    }
}