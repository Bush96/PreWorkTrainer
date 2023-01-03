package Prototype;

public class Chicken {
    public static void main(String[] args) {
        Egg newAgg = new Egg(1,"MrEgg");
        System.out.println(newAgg);

        EggFactory eggFactory = new EggFactory(newAgg);
        Egg alsoNewEgg = eggFactory.eggCopy();
        System.out.println(alsoNewEgg);
    }
}
