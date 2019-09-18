package cputpassword.service.admin;


import cputpassword.domain.admin.AdminCourseRegistration;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminCourseRegistrationService extends IService<AdminCourseRegistration, String> {
    Set<AdminCourseRegistration> getAll();
}

