package Bridge;

public class Google extends Program{

    public Google(Developer developer) {
        super(developer);
    }

    @Override
    public void working() {
        System.out.println("Google programming");
        developer.writeCode();
    }
}
