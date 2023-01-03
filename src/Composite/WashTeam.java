package Composite;

import java.util.ArrayList;
import java.util.List;

public class WashTeam {

    public List<Girls> washTeam = new ArrayList<>();

    public void addGirl(Girls girls){
        washTeam.add(girls);
    }

    public void removeGirl(Girls girls){
        washTeam.remove(girls);
    }

  public void washUp(){
        for (Girls girls:washTeam){
            girls.kitchenDeals();
        }
  }
}
