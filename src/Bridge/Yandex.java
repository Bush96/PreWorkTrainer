package Bridge;

public class Yandex extends Program {

    public Yandex(Developer developer) {
        super(developer);
    }

    @Override
    public void working() {
        System.out.println("Yandex progrramming");
        developer.writeCode();
    }
}
