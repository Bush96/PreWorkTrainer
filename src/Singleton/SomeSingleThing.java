package Singleton;

public class SomeSingleThing {

    private static SomeSingleThing someSingleThing;

    public SomeSingleThing getSomeSingleThing() {
        if (someSingleThing == null)
            someSingleThing = new SomeSingleThing();
        return someSingleThing;
    }

    public SomeSingleThing() {

    }
}
