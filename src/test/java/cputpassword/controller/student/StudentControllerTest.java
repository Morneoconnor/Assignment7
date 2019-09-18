package cputpassword.controller.student;

import cputpassword.domain.student.*;
import cputpassword.factory.student.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class StudentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/student/";
    HttpHeaders headers = new HttpHeaders();

    @Before
    public void setUp() throws Exception {

        headers.add("AUTHORIZATION","Basic c3R1ZGVudDpzdHVkZW50");
    }
    @Test
    public void create1() throws Exception {
        AuthenticationQuestion authenticationquestions =
                AuthenticationQuestionsFactory.createAuthenticationQuestions("mom"," dad",1);


        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.withBasicAuth("student","student").exchange(baseURL + "authentication/create/",
                HttpMethod.GET, entity, String.class, authenticationquestions);
        assertNotNull(response.getBody());
    }
    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void create2() throws Exception {
        BlackBoardNewPassword blackboardnewpassword =
                BlackBoardNewPasswordFactory.createBlackBoardNewPassword("Password123", 1);


        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "blackboardnewpassword/create/",
                HttpMethod.POST, entity, String.class, blackboardnewpassword);
        assertNotNull(response.getBody());
    }

    @Test
    public void create3() throws Exception {
        BlackBoardPassword blackboardpassword =
                BlackBoardPasswordFactory.createBlackBoardPassword("Password12", 1);

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "blackboardpassword/create/",
                HttpMethod.POST, entity, String.class, blackboardpassword);
        assertNotNull(response.getBody());
    }

    @Test
    public void create4() throws Exception {
        CourseRegistration courseregistration =
                CourseRegistrationFactory.createCourseRegistration("App Dev", 123);

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "courseregistration/create/",
                HttpMethod.POST, entity, String.class, courseregistration);
        assertNotNull(response.getBody());
    }

    @Test
    public void create5() throws Exception {
        CourseSubjects coursesubjects =
                CourseSubjectsFactory.createCourseRegistration("Prof Comm", 123);

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "courseregistration/create/",
                HttpMethod.POST, entity, String.class, coursesubjects);
        assertNotNull(response.getBody());
    }

    @Test
    public void create6() throws Exception {
        PasswordRequirements passwordrequirements =
                PasswordRequirementsFactory.createPasswordRequirements("PPPPPP", 6, 1);

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "passwordrequirements/create/",
                HttpMethod.POST, entity, String.class, passwordrequirements);
        assertNotNull(response.getBody());
    }

    @Test
    public void create7() throws Exception {
        SOSNewPassword sosnewpassword =
                SOSNewPasswordFactory.createSOSNewPassword("Password123!", 1);

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "sosnewpassword/create/",
                HttpMethod.POST, entity, String.class, sosnewpassword);
        assertNotNull(response.getBody());
    }

    @Test
    public void create8() throws Exception {
        SOSPassword sospassword =
                SOSPasswordFactory.createSOSPassword("Password12", 1);

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "sospassword/create/",
                HttpMethod.POST, entity, String.class, sospassword);
        assertNotNull(response.getBody());
    }

    @Test
    public void create9() throws Exception {
        StudentPersonalInformation studentpersonalinformation =
                StudentPersonalInformationFactory.createStudentPersonalInformation
                        ("Morne","OConnor","123","123","morne@test.com");

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "studentpersonalinformation/create/",
                HttpMethod.POST, entity, String.class, studentpersonalinformation);
        assertNotNull(response.getBody());
    }






}