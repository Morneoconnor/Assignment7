package cputpassword.service.admin;


import cputpassword.domain.admin.AdminCourseSubjects;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminCourseSubjectsService extends IService<AdminCourseSubjects, String> {
        Set<AdminCourseSubjects> getAll();
        }

