package cputpassword.service.admin;


import cputpassword.domain.admin.AdminBlackBoardPassword;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminBlackBoardPasswordService extends IService<AdminBlackBoardPassword, String> {
    Set<AdminBlackBoardPassword> getAll();
}

