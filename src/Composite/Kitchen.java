package Composite;

public class Kitchen {
    public static void main(String[] args) {

        WashTeam washTeam = new WashTeam();

        washTeam.addGirl(new Mom());
        washTeam.addGirl(new Sister());
        washTeam.addGirl(new Wife());

        washTeam.washUp();
    }
}