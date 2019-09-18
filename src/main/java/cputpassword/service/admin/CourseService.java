package cputpassword.service.admin;

import cputpassword.domain.admin.Course;
import cputpassword.service.IService;

import java.util.Set;

public interface CourseService extends IService<Course, String> {
    Set<Course> getAll();
}
