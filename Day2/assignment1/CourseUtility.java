package solutions.assignment1;


import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {

    String type;
    String direction;

    public CourseUtility(String type, String direction) {
        this.type = type;
        this.direction = direction;
    }

    @Override
    public int compare(Course c1, Course c2) {

        // Sorting by fee
        if(type.equals("FEE")) {

            if(direction.equals("ASC")) {

                if(c1.fee > c2.fee)
                    return 1;

                if(c1.fee < c2.fee)
                    return -1;
            }
            else {

                if(c1.fee < c2.fee)
                    return 1;

                if(c1.fee > c2.fee)
                    return -1;
            }
        }

        // Sorting by name
        else if(type.equals("NAME")) {

            return c1.name.compareTo(c2.name);
        }

        return 0;
    }
}

