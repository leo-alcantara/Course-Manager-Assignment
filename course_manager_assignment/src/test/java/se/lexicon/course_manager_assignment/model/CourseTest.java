package se.lexicon.course_manager_assignment.model;

import org.junit.jupiter.api.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CourseTest {

    Course newCourse;
    Collection<Student> students = new HashSet<>();

    @Test
    void enrollStudent_Test() {
        //Arrange

        Student newStudent = new Student(1, "Leo", "leo@mail.com", "Some Street");

        //Act
        newCourse.enrollStudent(newStudent);
        int size = students.size();

        //Assert
       assertEquals(1, size);
    }

    @Test
    void unrollStudent_Test() {
        //Arrange
        Student newStudent = new Student(1, "Leo", "leo@mail.com", "Some Street");
        //Act
        newCourse.unrollStudent(newStudent);
        int size = students.size();

        //Assert
        assertEquals(1,size);
    }
}
