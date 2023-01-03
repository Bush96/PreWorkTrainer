package Decorator;

public class Task {
    public static void main(String[] args) {
        Worker worker = new BadBuilder(new Builder());

        System.out.println(worker.working());
    }
}
