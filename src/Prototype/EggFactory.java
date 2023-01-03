package Prototype;

public class EggFactory {

    Egg egg;

    public EggFactory(Egg egg) {
        this.egg = egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    Egg eggCopy (){
        return (Egg) egg.copy();
    }
}
