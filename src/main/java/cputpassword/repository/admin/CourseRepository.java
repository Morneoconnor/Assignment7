package cputpassword.repository.admin;

import cputpassword.domain.admin.Course;
import cputpassword.repository.IRepository;

import java.util.Set;

public interface CourseRepository extends IRepository<Course, String> {
    Set<Course> getAll();
}
