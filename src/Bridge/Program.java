package Bridge;

public abstract class Program {
    Developer developer;


    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void working();
}
