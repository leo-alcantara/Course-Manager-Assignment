package se.lexicon.course_manager_assignment.data.dao;


import se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer;
import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;

import java.time.LocalDate;
import java.util.*;


public class CourseCollectionRepository implements CourseDao {

    Course course;
    Student student;

    private Collection<Course> courses;

    public CourseCollectionRepository(Collection<Course> courses) {
        this.courses = courses;
    }

    @Override
    public Course createCourse(String courseName, LocalDate startDate, int weekDuration) {
        int COURSEID = CourseSequencer.nextCourseId();
        Course course = new Course(COURSEID, courseName, startDate, weekDuration, student);
        return course;
    }

    @Override
    public Course findById(int id) {
        for (Course course : courses) {
            if (course.getCOURSEID() == id) {
                return course;
            }
        }
        return null;
    }

    @Override
    public Collection<Course> findByNameContains(String name) {
        ArrayList<String> allCoursesNamesMatched = new ArrayList<>();
        for(Course course : courses) {
                if (name.contains(course.getCourseName())) {
                    allCoursesNamesMatched.add(name);
                }
            }
            return null;
    }

    @Override
    public Collection<Course> findByDateBefore(LocalDate end) {
        return null;
    }

    @Override
    public Collection<Course> findByDateAfter(LocalDate start) {
        return null;
    }

    @Override
    public Collection<Course> findAll() {
        HashSet<Course> allCourses = new HashSet<>();
        allCourses.addAll(courses);
        return allCourses;
    }

    @Override
    public Collection<Course> findByStudentId(int studentId) {
        for (int i = 0; i < courses.size(); i++) {
            if (studentId == student.getSTUDENTID()) {
                return courses;
            }
        }
        return null;
    }

    @Override
    public boolean removeCourse(Course course) {
        courses.remove(course);
        return false;
    }

    @Override
    public void clear() {
        this.courses = new HashSet<>();
    }
}
