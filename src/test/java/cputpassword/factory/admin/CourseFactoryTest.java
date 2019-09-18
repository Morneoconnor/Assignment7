package cputpassword.factory.admin;

import cputpassword.domain.admin.Course;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CourseFactoryTest {

    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }

    @Test
    public void buildCourse() {
        Course course = CourseFactory.buildCourse(this.testName);
        Assert.assertNotNull(course.getCourseId());
        Assert.assertNotNull(course);
    }
}