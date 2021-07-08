package se.lexicon.course_manager_assignment.data.service.converter;

import org.springframework.stereotype.Component;
import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.dto.views.CourseView;
import se.lexicon.course_manager_assignment.dto.views.StudentView;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;


import java.util.*;

@Component
public class ModelToDto implements Converters {

    private Collection<Student> students;
    public List<CourseView> allCourseView = new ArrayList<>();
    public List<CourseView> allCoursesViews = new ArrayList<>();


    @Override
    public StudentView studentToStudentView(Student student) {
        StudentView newStudentView = new StudentView(student.getSTUDENTID(), student.getName(), student.getEmail(), student.getAddress());
        return newStudentView;
    }


    @Override
    public CourseView courseToCourseView(Course course) {
        List<StudentView> allStudentsView = new ArrayList<>();
        for (Student student :
                students) {
            if(student.equals(student)){
                studentToStudentView(student);
            }
        }
        CourseView newCourseView = new CourseView(course.getCOURSEID(), course.getCourseName(), course.getStartDate(),
                course.getWeekDuration(), allStudentsView);
        allCourseView.add(newCourseView);
        return newCourseView;
    }


    @Override
    public List<CourseView> coursesToCourseViews(Collection<Course> courses) {
        for (Course course :
                courses) {
            if(course.equals(course)){
                allCoursesViews.add(courseToCourseView(course));
            }
        }
        return allCoursesViews;
    }


    @Override
    public List<StudentView> studentsToStudentViews(Collection<Student> students) {
        List<StudentView> allStudentsView = new ArrayList<>();
        for (Student student :
                students) {
            if(student.equals(student)){
                allStudentsView.add(studentToStudentView(student));
            }
        }
        return allStudentsView;
    }
}
