package cputpassword.service.admin;


import cputpassword.domain.admin.AdminPasswordRequirements;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminPasswordRequirementsService extends IService<AdminPasswordRequirements, String> {
    Set<AdminPasswordRequirements> getAll();
}
