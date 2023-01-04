package Strategy;

public class Me {
    Activitys activitys;

    public void setActivitys(Activitys activitys) {
        this.activitys = activitys;
    }

    public void myRoutine(){
        activitys.doIt();
    }
}
