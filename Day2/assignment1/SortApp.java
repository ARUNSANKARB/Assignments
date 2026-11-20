package solutions.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortApp {

    public static void main(String[] args) {

        // Creating Course objects
        Course c1 = new Course(101, "Java", 15000);
        Course c2 = new Course(102, "Python", 12000);
        Course c3 = new Course(103, "React", 15000);
        Course c4 = new Course(104, "SQL", 8000);
        Course c5 = new Course(105, "Angular", 12000);

        // Creating a List
        List<Course> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        System.out.println("***** All Courses *****");

        for(Course c : list) {
            System.out.println(c);
        }

        System.out.println("***** Fee ASC Order *****");
        sortCourses(list, "FEE", "ASC");

        System.out.println("***** Fee DESC Order *****");
        sortCourses(list, "FEE", "DESC");

        System.out.println("***** Name A to Z *****");
        sortCourses(list, "NAME", "ASC");
    }

    private static void sortCourses(List<Course> list,
                                    String type,
                                    String direction) {

        Collections.sort(list,
                new CourseUtility(type, direction));

        for(Course c : list) {
            System.out.println(c);
        }
    }
}

