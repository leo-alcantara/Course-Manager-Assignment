package se.lexicon.course_manager_assignment.data.service.converter;

import org.springframework.stereotype.Component;
import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.dto.views.CourseView;
import se.lexicon.course_manager_assignment.dto.views.StudentView;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;


import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@Component
public class ModelToDto implements Converters {

    @Override
    public StudentView studentToStudentView(Student student) {
        StudentView newStudentView = new StudentView(student.getSTUDENTID(), student.getName(), student.getEmail(), student.getAddress());
        HashSet<StudentView> allStudentsView = new HashSet<>();
        allStudentsView.add(newStudentView);
        return newStudentView;
    }

    @Override
    public CourseView courseToCourseView(Course course) {
        //CourseView newCourseView = new CourseView(course.getCOURSEID(), course.getCourseName(), course.getStartDate(),course.getWeekDuration(), studentToStudentView(course.getStudent()));
        return null;
    }

    @Override
    public List<CourseView> coursesToCourseViews(Collection<Course> courses) {
        HashSet<CourseView> allCoursesToView = new HashSet<>();

        return null;
    }

    @Override
    public List<StudentView> studentsToStudentViews(Collection<Student> students) {
        return null;
    }
}
