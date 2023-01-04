package State;

public class Life {
    public static void main(String[] args) {
        Activitys activitys = new Procractination();
        Me me = new Me();

        me.setActivitys(activitys);

       for (int i = 0; i<10; i++){
           me.doRoutine();
           me.myRoutine();
       }
    }
}
