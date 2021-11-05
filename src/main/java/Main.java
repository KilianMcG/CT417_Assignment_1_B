import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Engineering", new LocalDate(2018, 9, 23), new LocalDate(2022, 5, 14));
        Course c2 = new Course("Computer Science", LocalDate.parse("2018-9-23"), LocalDate.parse("2022-5-14"));

        Module m1 = new Module("Software Engineering III", "CT417");
        Module m2 = new Module("System on Chip Design I", "EE451");
        Module m3 = new Module("System on Chip Design II", "EE452");
        Module m4 = new Module("Database Systems", "CT440");

        Student s1 = new Student("Jim Johnson", 18181818, LocalDate.parse("1999-12-18"));
        Student s2 = new Student("Tim Thomson", 18229229, LocalDate.parse("1998-9-1"));
        Student s3 = new Student("Tim Thompson", 18332333, LocalDate.parse("1998-9-1"));
        Student s4 = new Student("Kim Konson", 18449994, LocalDate.parse("2000-4-20"));
        Student s5 = new Student("Jamie", 17111212, LocalDate.parse("1999-10-10"));


        c1.addModule(m1);
        c1.addModule(m2);
        c1.addModule(m3);

        c2.addModule(m1);
        c2.addModule(m4);

        s1.addCourse(c1);
        s2.addCourse(c1);
        s3.addCourse(c1);
        s4.addCourse(c1);
        s4.addCourse(c2);
        s5.addCourse(c2);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s1);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        for(Course c : courses){
            System.out.println(c.getName() + ": ");
            for(Module m : c.getModule()) {
                System.out.println("\t" + m.getID() + ": " + m.getName());
            }
        }
        System.out.println();

        for (Student s : students){
            System.out.println(s.getName() + ", " + s.getUName());
            System.out.println("Modules:");

            for(Module m : s.getModules()) {
                System.out.println("\t" + m.getID() + ": " + m.getName());
            }

            System.out.println("Courses:");
            for (Course c : s.getCourses()){
                System.out.println("\t" + c.getName());
            }
            System.out.println();
        }
    }
}
