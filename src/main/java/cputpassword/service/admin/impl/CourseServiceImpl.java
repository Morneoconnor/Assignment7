package cputpassword.service.admin.impl;

import cputpassword.domain.admin.Course;
import cputpassword.repository.admin.CourseRepository;
import cputpassword.repository.admin.impl.CourseRepositoryImpl;
import cputpassword.service.admin.CourseService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CourseServiceImpl implements CourseService {

    private static CourseServiceImpl service = null;
    private CourseRepository repository;

    private CourseServiceImpl() {
        this.repository = CourseRepositoryImpl.getRepository();
    }

    public static CourseServiceImpl getService(){
        if (service == null) service = new CourseServiceImpl();
        return service;
    }

    @Override
    public Course create(Course course) {
        return this.repository.create(course);
    }

    @Override
    public Course update(Course course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Course read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Course> getAll() {
        return this.repository.getAll();
    }
}
