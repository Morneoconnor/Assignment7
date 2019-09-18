package cputpassword.service.admin;


import cputpassword.domain.admin.Admin;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminService extends IService<Admin, String> {
    Set<Admin> getAll();
}
