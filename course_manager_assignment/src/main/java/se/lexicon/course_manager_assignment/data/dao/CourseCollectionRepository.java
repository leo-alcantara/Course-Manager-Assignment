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
        Course course = new Course(COURSEID, courseName, startDate, weekDuration);
        courses.add(course);
        return course;
    }

    @Override
    public Course findById(int id) {
        for (Course course : courses) {
            if (id == course.getCOURSEID()) {
                return course;
            } else {
                return null;
            }
        }
        return course;
    }

    @Override
    public Collection<Course> findByNameContains(String name) {
        HashSet<Course> allCoursesNamesMatched = new HashSet<>();
        for(Course course : courses) {
                if (name.contains(course.getCourseName())) {
                    allCoursesNamesMatched.add(course);
                } else {
                    return null;
                }
            }
            return allCoursesNamesMatched;
    }

    @Override
    public Collection<Course> findByDateBefore(LocalDate end) {
        HashSet<Course> allCoursesBeforeDate = new HashSet<>();
        for(Course course : courses) {
            if (end.isBefore(course.getStartDate())) {
                allCoursesBeforeDate.add(course);
            } else {
                return null;
            }
        }
        return allCoursesBeforeDate;
    }

    @Override
    public Collection<Course> findByDateAfter(LocalDate start) {
        HashSet<Course> allCoursesAfterDate = new HashSet<>();
        for(Course course : courses) {
            if (start.isAfter(course.getStartDate())) {
                allCoursesAfterDate.add(course);
            } else {
                return null;
            }
        }
        return allCoursesAfterDate;
    }

    @Override
    public Collection<Course> findAll() {
        HashSet<Course> allCourses = new HashSet<>();
        allCourses.addAll(courses);
        return allCourses;
    }

    @Override
    public Collection<Course> findByStudentId(int studentId) {
        HashSet<Course> courseFoundByStudentId = new HashSet<>();
        for (int i = 0; i < courses.size(); i++) {
            if (studentId == student.getSTUDENTID()) {
                courseFoundByStudentId.add(course);
            } else {
                return null;
            }
        }
        return courseFoundByStudentId;
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
