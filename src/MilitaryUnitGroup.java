/**
 * Created by Connor on 4/5/16.
 */

import java.util.*;

public class MilitaryUnitGroup extends MilitaryUnitComponent {

    ArrayList unitGroup = new ArrayList();

    String unitGroupName;

    public MilitaryUnitGroup(String newUnitGroupName){

        unitGroupName = newUnitGroupName;

    }

    public String getUnitGroupName() {
        return unitGroupName;
    }

    public void add(MilitaryUnitComponent newMilitaryUnitComponent){

        unitGroup.add(newMilitaryUnitComponent);
    }

    public void remove(MilitaryUnitComponent newMilitaryUnitComponent){

        unitGroup.remove(newMilitaryUnitComponent);

    }

    public MilitaryUnitComponent getUnitComponent( int unitComponentIndex){

        return (MilitaryUnitComponent)unitGroup.get(unitComponentIndex);

    }

    public void displayUnitInfo(){
        System.out.println(getUnitGroupName() + "\n");

        Iterator unitIterator = unitGroup.iterator();

        while(unitIterator.hasNext()){

            MilitaryUnitComponent unitInfo = (MilitaryUnitComponent) unitIterator.next();

            unitInfo.displayUnitInfo();
        }
    }
}
