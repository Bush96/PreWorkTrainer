package Factory_method;

public class WaterTransport implements Transport {

    @Override
    public void doSomething() {
        System.out.println("WaterTransport make his deals");
    }
}