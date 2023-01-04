package State;

public class Me {
    Activitys activitys;

    public void setActivitys(Activitys activitys) {
        this.activitys = activitys;
    }

    public void myRoutine() {
        if (activitys instanceof Procractination) {
            setActivitys(new Warcraft3());
        } else if (activitys instanceof Warcraft3) {
            setActivitys(new WatchForBirds());

        } else if (activitys instanceof WatchForBirds) {
            setActivitys(new Procractination());
        }
    }

    public void doRoutine() {
        activitys.doIt();
    }
}
