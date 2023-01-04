package Strategy;

public class Life {
    public static void main(String[] args) {
        Me me = new Me();
        me.setActivitys(new Procractination());
        me.myRoutine();
        me.setActivitys(new Warcraft3());
        me.myRoutine();
        me.setActivitys(new WatchForBirds());
        me.myRoutine();
        me.setActivitys(new Procractination());
        me.myRoutine();
    }
}
