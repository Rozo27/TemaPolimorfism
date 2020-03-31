package runTime;

import java.util.ArrayList;

public class RunTimeMain {
    public static void main(String[] args) {
        ArrayList<Plant> a = new ArrayList<Plant>();
        a.add(new Vegetables());
        a.add(new Flowers());
        a.add(new Salad());
        a.add(new Rose());
        for(Plant i:a){
            i.print();
        }
    }
}
