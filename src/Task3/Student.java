package Task3;

import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses = new ArrayList<String>();


    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
         this.passedCourses = passedCourses;

    }

    @Override
    public boolean addCourse(String course) {
        if(!passedCourses.contains(course) && currentCourses.contains(course)){
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "passedCourses=" + passedCourses +
                ", currentCourses=" + currentCourses +
                '}';
    }
}
