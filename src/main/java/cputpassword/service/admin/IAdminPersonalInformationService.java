package cputpassword.service.admin;


import cputpassword.domain.admin.AdminPersonalInformation;
import cputpassword.service.IService;

import java.util.Set;

public interface IAdminPersonalInformationService extends IService<AdminPersonalInformation, String> {
    Set<AdminPersonalInformation> getAll();
}