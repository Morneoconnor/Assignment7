package cputpassword.service.student;

import cputpassword.domain.student.Student;
import cputpassword.service.IService;

import java.util.Set;

public interface StudentService extends IService<Student,String> {
    Set<Student> getAll();
}
