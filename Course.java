package Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    private String name;
    private int hours;
    private List<Lecturer> spisSotr = new ArrayList<>();


    Course(String name, Lecturer...spisSotr) {
        this.name = name;
        this.spisSotr.addAll((Arrays.asList(spisSotr)));
    }

    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;

    }


    public void setHours(int hours){
        this.hours = hours;

    }

    public void setVr(Lecturer spisSotr) {
        this.spisSotr.add(spisSotr);
    }


    public String toString() {
        return name ;
    }

}
