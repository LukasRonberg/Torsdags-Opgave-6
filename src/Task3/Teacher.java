package Task3;

import java.util.ArrayList;


public class Teacher extends Person {
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course) && !currentCourses.contains(course)) {
            currentCourses.add(course);

            return true;
        } else {

            return false;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "canTeach=" + canTeach +
                ", currentCourses=" + currentCourses +
                '}';
    }

    public ArrayList<String> getCanTeach() {
        return canTeach;
    }
}