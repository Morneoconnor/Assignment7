package cputpassword.factory.admin;

import cputpassword.domain.admin.Course;
import cputpassword.util.Misc;

public class CourseFactory {

    public static Course buildCourse(String courseName) {
        return new Course.Builder().courseId(Misc.generateId())
                .courseName(courseName)
                .build();
    }
}
