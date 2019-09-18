package cputpassword.service.admin;


import cputpassword.domain.admin.AdminSOSPassword;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminSOSPasswordService extends IService<AdminSOSPassword, String> {
    Set<AdminSOSPassword> getAll();
}
