package Singleton;

public class Test {
    public static void main(String[] args) {
        System.out.println(new SomeSingleThing().getSomeSingleThing().toString());
        System.out.println(new SomeSingleThing().getSomeSingleThing().toString());
        System.out.println(new SomeSingleThing().getSomeSingleThing().toString());
        System.out.println(new SomeSingleThing().getSomeSingleThing().toString());

    }
}
