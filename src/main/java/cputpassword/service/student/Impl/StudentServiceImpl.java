package cputpassword.service.student.Impl;

import cputpassword.domain.student.Student;
import cputpassword.repository.student.StudentRepository;
import cputpassword.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceImpl")
public class StudentServiceImpl  implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(Student student) {
        return repository.create(student);
    }

    @Override
    public Student update(Student student) {
        return repository.update(student);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Student read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Student> getAll() {
        return repository.getAll();
    }
}
