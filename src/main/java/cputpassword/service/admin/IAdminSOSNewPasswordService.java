package cputpassword.service.admin;


import cputpassword.domain.admin.AdminSOSNewPassword;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminSOSNewPasswordService extends IService<AdminSOSNewPassword, String> {
    Set<AdminSOSNewPassword> getAll();
}