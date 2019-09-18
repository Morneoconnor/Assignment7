package cputpassword.controller.student;


import cputpassword.domain.student.*;
import cputpassword.factory.student.*;
import cputpassword.service.student.Impl.*;
import cputpassword.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Qualifier("AuthenticationQuestionService")
    private AuthenticationQuestionService authenticationService;

    @Qualifier("BlackBoardNewPasswordService")
    private BlackBoardNewPasswordService blackBoardNewPasswordService;

    @Qualifier("BlackBoardPasswordService")
    private BlackBoardPasswordService blackBoardPasswordService;

    @Qualifier("CourseRegistrationService")
    private CourseRegistrationService courseRegistrationService;

    @Qualifier("CourseSubjectsService")
    private CourseSubjectsService courseSubjectsService;

    @Qualifier("PasswordRequirementsService")
    private PasswordRequirementsService passwordRequirementsService;

    @Qualifier("SOSNewPasswordService")
    private SOSNewPasswordService sosNewPasswordService;

    @Qualifier("SOSPasswordService")
    private SOSPasswordService sosPasswordService;

    @Qualifier("StudentService")
    private StudentService studentService;

    @Qualifier("StudentPersonalInformationService")
    private StudentPersonalInformationService studentPersonalInformationService;

    @PostMapping("authentication/create/{}")
    public @ResponseBody
    AuthenticationQuestion create(AuthenticationQuestion question) {
        AuthenticationQuestion authentication = AuthenticationQuestionsFactory.createAuthenticationQuestions(question.getMotherName(),
                question.getFatherName(), question.getId());
        return authenticationService.create(authentication);
    }

    @GetMapping("authentication/getall")
    @ResponseBody
    public Set<AuthenticationQuestion> getAll(){
        return authenticationService.getAll();
    }

    @PostMapping("blackboardnewpassword/create/{course}")
    public @ResponseBody
    BlackBoardNewPassword create(BlackBoardNewPassword blackboard) {
        BlackBoardNewPassword blackboardPassword = BlackBoardNewPasswordFactory.createBlackBoardNewPassword(blackboard.getNewBlackBoardPassword(),
                blackboard.getId());
        return blackBoardNewPasswordService.create(blackboardPassword);
    }

    @PostMapping("blackboardpassword/create/{course}")
    public @ResponseBody
    BlackBoardPassword create(BlackBoardPassword blackboard) {
        BlackBoardPassword blackboardPassword = BlackBoardPasswordFactory.createBlackBoardPassword(blackboard.getOldBlackBoardPassword(),
                blackboard.getId());
        return blackBoardPasswordService.create(blackboardPassword);
    }

    @PostMapping("courseregistraton/create/{course}")
    public @ResponseBody
    CourseRegistration create(CourseRegistration courseReg) {
        CourseRegistration courseRegistration = CourseRegistrationFactory.createCourseRegistration(
                courseReg.getCourseName(), courseReg.getCourseId());
        return courseRegistrationService.create(courseRegistration);
    }

    @PostMapping("coursesubjects/create/{course}")
    public @ResponseBody
    CourseSubjects create(CourseSubjects courseSub) {
        CourseSubjects courseSubjects = CourseSubjectsFactory.createCourseRegistration(
                courseSub.getSubjectName(), courseSub.getSubjectId());
        return courseSubjectsService.create(courseSubjects);
    }

    @PostMapping("passwordrequirements/create/{course}")
    public @ResponseBody
    PasswordRequirements create(PasswordRequirements passwordReq) {
        PasswordRequirements passwordR = PasswordRequirementsFactory.createPasswordRequirements(passwordReq.getPasswordCharacther(),
                passwordReq.getPasswordCharactherLenght(), passwordReq.getId());

        return passwordRequirementsService.create(passwordR);
    }

    @PostMapping("sosnewpassword/create/{course}")
    public @ResponseBody
    SOSNewPassword create(SOSNewPassword sosPasswordReq) {
        SOSNewPassword sosPasswordR = SOSNewPasswordFactory.createSOSNewPassword(sosPasswordReq.getNewSOSPassword(),
                sosPasswordReq.getId());

        return sosNewPasswordService.create(sosPasswordR);
    }

    @PostMapping("sospassword/create/{course}")
    public @ResponseBody
    SOSPassword create(SOSPassword sosPasswordReq) {
        SOSPassword sosPasswordR = SOSPasswordFactory.createSOSPassword(sosPasswordReq.getOldSOSPassword(),
                sosPasswordReq.getId());

        return sosPasswordService.create(sosPasswordR);
    }


    @PostMapping("studentpersonalinformation/create/{course}")
    public @ResponseBody
    StudentPersonalInformation create(StudentPersonalInformation student) {
        StudentPersonalInformation stud = StudentPersonalInformationFactory.createStudentPersonalInformation(
                student.getStudentName(),student.getStudentSurName(), student.getStudentNumber(), student.getStudentIdNumber(), student.getEmailAddress());

        return studentPersonalInformationService.create(stud);
    }


}




