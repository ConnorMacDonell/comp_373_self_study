/**
 * Created by Connor on 4/5/16.
 */

import java.util.*;

public class MilitaryUnit extends MilitaryUnitComponent {

    private String unitName;
    private String unitTitle;
    private int unitStrength;

    public MilitaryUnit(String newUnitName, String newUnitTitle, int newUnitStrength) {

        unitName = newUnitName;
        unitTitle = newUnitTitle;
        unitStrength = newUnitStrength;
    }

    @Override
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String getUnitTitle() {
        return unitTitle;
    }

    public void setUnitTitle(String unitTitle) {
        this.unitTitle = unitTitle;
    }

    @Override
    public int getUnitStrength() {
        return unitStrength;
    }

    public void setUnitStrength(int unitStrength) {
        this.unitStrength = unitStrength;
    }

    public void displayUnitInfo(){

        System.out.println("Unit Name: " + getUnitName() + ", Unit Title: "
                + getUnitTitle() + "Unit Strength: " + getUnitStrength());
    }
}