package cputpassword.repository.student;

import cputpassword.domain.student.Student;
import cputpassword.repository.IRepository;

import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {
    Set<Student> getAll();

}
