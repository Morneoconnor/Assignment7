package cputpassword.controller.admin;

import cputpassword.domain.admin.*;
import cputpassword.factory.admin.*;
import cputpassword.service.admin.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Qualifier("AdminAuthenticationQuestionService")
    private AdminAuthenticationQuestionService authenticationService;

    @Qualifier("AdminBlackBoardNewPasswordService")
    private AdminBlackBoardNewPasswordService blackBoardNewPasswordService;

    @Qualifier("AdminBlackBoardPasswordService")
    private AdminBlackBoardPasswordService blackBoardPasswordService;

    @Qualifier("AdminCourseRegistrationService")
    private AdminCourseRegistrationService courseRegistrationService;

    @Qualifier("AdminCourseSubjectsService")
    private AdminCourseSubjectsService courseSubjectsService;

    @Qualifier("AdminPasswordRequirementsService")
    private AdminPasswordRequirementsService passwordRequirementsService;

    @Qualifier("AdminSOSNewPasswordService")
    private AdminSOSNewPasswordService sosNewPasswordService;

    @Qualifier("AdminSOSPasswordService")
    private AdminSOSPasswordService sosPasswordService;

    @Qualifier("AdminService")
    private AdminService studentService;

    @Qualifier("AdminStudentPersonalInformationService")
    private AdminPersonalInformationService studentPersonalInformationService;

    @PostMapping("adminauthentication/create/{course}")
    public @ResponseBody
    AdminAuthenticationQuestion create(AdminAuthenticationQuestion question) {
        AdminAuthenticationQuestion authentication = AdminAuthenticationQuestionFactory.createAuthenticationQuestions(question.getMotherName(),
                question.getFatherName(), question.getId());
        return authenticationService.create(authentication);
    }

    @GetMapping("adminauthentication/getall")
    @ResponseBody
    public Set<AdminAuthenticationQuestion> getAll(){
        return authenticationService.getAll();
    }

    @PostMapping("adminblackboardnewpassword/create/{course}")
    public @ResponseBody
    AdminBlackBoardNewPassword create(AdminBlackBoardNewPassword blackboard) {
        AdminBlackBoardNewPassword blackboardPassword = AdminBlackBoardNewPasswordFactory.createBlackBoardNewPassword(blackboard.getNewBlackBoardPassword(),
                blackboard.getId());
        return blackBoardNewPasswordService.create(blackboardPassword);
    }

    @PostMapping("adminblackboardpassword/create/{course}")
    public @ResponseBody
    AdminBlackBoardPassword create(AdminBlackBoardPassword blackboard) {
        AdminBlackBoardPassword blackboardPassword = AdminBlackBoardPasswordFactory.createBlackBoardPassword(blackboard.getOldBlackBoardPassword(),
                blackboard.getId());
        return blackBoardPasswordService.create(blackboardPassword);
    }

    @PostMapping("admincourseregistraton/create/{course}")
    public @ResponseBody
    AdminCourseRegistration create(AdminCourseRegistration courseReg) {
        AdminCourseRegistration courseRegistration = AdminCourseRegistrationFactory.createCourseRegistration(
                courseReg.getCourseName(), courseReg.getCourseId());
        return courseRegistrationService.create(courseRegistration);
    }

    @PostMapping("admincoursesubjects/create/{course}")
    public @ResponseBody
    AdminCourseSubjects create(AdminCourseSubjects courseSub) {
        AdminCourseSubjects courseSubjects = AdminCourseSubjectsFactory.createCourseRegistration(
                courseSub.getSubjectName(), courseSub.getSubjectId());
        return courseSubjectsService.create(courseSubjects);
    }

    @PostMapping("adminpasswordrequirements/create/{course}")
    public @ResponseBody
    AdminPasswordRequirements create(AdminPasswordRequirements passwordReq) {
        AdminPasswordRequirements passwordR = AdminPasswordRequirementsFactory.createPasswordRequirements(passwordReq.getPasswordCharacther(),
                passwordReq.getPasswordCharactherLenght(), passwordReq.getId());

        return passwordRequirementsService.create(passwordR);
    }

    @PostMapping("adminsosnewpassword/create/{course}")
    public @ResponseBody
    AdminSOSNewPassword create(AdminSOSNewPassword sosPasswordReq) {
        AdminSOSNewPassword sosPasswordR = AdminSOSNewPasswordFactory.createSOSNewPassword(sosPasswordReq.getNewSOSPassword(),
                sosPasswordReq.getId());

        return sosNewPasswordService.create(sosPasswordR);
    }

    @PostMapping("adminsospassword/create/{course}")
    public @ResponseBody
    AdminSOSPassword create(AdminSOSPassword sosPasswordReq) {
        AdminSOSPassword sosPasswordR = AdminSOSPasswordFactory.createSOSPassword(sosPasswordReq.getOldSOSPassword(),
                sosPasswordReq.getId());

        return sosPasswordService.create(sosPasswordR);
    }


    @PostMapping("adminpersonalinformation/create/{course}")
    public @ResponseBody
    AdminPersonalInformation create(AdminPersonalInformation student) {
        AdminPersonalInformation stud = AdminPersonalInformationFactory.createStudentPersonalInformation(
                student.getStudentName(),student.getStudentSurName(), student.getStudentNumber(), student.getStudentIdNumber(), student.getEmailAddress());

        return studentPersonalInformationService.create(stud);
    }


}




