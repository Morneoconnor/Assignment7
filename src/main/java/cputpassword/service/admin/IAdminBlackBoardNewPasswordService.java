package cputpassword.service.admin;


import cputpassword.domain.admin.AdminBlackBoardNewPassword;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminBlackBoardNewPasswordService extends IService<AdminBlackBoardNewPassword, String> {
    Set<AdminBlackBoardNewPassword> getAll();
}