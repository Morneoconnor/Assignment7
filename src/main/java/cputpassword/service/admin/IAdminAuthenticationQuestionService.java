package cputpassword.service.admin;



import cputpassword.domain.admin.AdminAuthenticationQuestion;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminAuthenticationQuestionService extends IService<AdminAuthenticationQuestion, String> {
    Set<AdminAuthenticationQuestion> getAll();
}
