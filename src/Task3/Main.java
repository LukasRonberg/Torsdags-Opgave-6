package Task3;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        ArrayList<String> studentPassedCourses = new ArrayList<>();
        studentPassedCourses.add("Marketing");
        studentPassedCourses.add("Basic Mathematics");

        Student s1 = new Student("Mads", studentPassedCourses);

        Student s2 = new Student("Josef", studentPassedCourses);
        Student s3 = new Student("Børge", studentPassedCourses);

        Student s4 = new Student("Henning", studentPassedCourses);


        ArrayList<String> canTeach = new ArrayList<>();
        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Java 1.0");
        ArrayList<String> canTeach3 = new ArrayList<>();

        Teacher t1 = new Teacher("Karl", canTeach);
        Teacher t2 = new Teacher("Josefine", canTeach2);

        Teacher t3 = new Teacher("Bobby", canTeach3);

        person.add(s1);
        person.add(s2);
        person.add(s3);
        person.add(s4);
        person.add(t1);
        person.add(t2);
        person.add(t3);

        //t1.addCourse("Java 1.0");
        s1.addCourse("Java 1.0");
        s3.addCourse("Java 1.0");
        s4.addCourse("Java 1.0");

        //System.out.println(s1);


        for (Person p: person){
            boolean passed = p.addCourse("Java 1.0");
            if(!passed){
                System.out.print(p.getName());
            if(p instanceof Student) {
                System.out.println(" has already passed this course.");
            } else if (p instanceof Teacher && !((Teacher) p).getCanTeach().contains("Java 1.0")){
                System.out.println(" can not teach this course.");
            }

            }

        }
    }
}
