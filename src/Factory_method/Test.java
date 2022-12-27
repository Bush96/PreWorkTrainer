package Factory_method;

public class Test {
    public static void main(String[] args) {
        Transport at = new AirTransport();
        Transport wt = new WaterTransport();

        at.doSomething();
        wt.doSomething();
    }
}