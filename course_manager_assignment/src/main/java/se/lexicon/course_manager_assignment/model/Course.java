package se.lexicon.course_manager_assignment.model;

import se.lexicon.course_manager_assignment.data.sequencers.CourseSequencer;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

public class Course {

    Collection<Student> students;

    private final int COURSEID;
    String courseName;
    LocalDate startDate;
    int weekDuration;
    Student student;

    public Course(int COURSEID, String courseName, LocalDate startDate, int weekDuration, Student student) {
        this.COURSEID = COURSEID;
        this.courseName = courseName;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.student = student;
    }

    public int getCOURSEID() {
        return COURSEID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean enrollStudent(Student student) {
        students.add(student);
        return true;
    }

    public boolean unenrollStudent(Student student) {
        students.remove(student);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return COURSEID == course.COURSEID && weekDuration == course.weekDuration && courseName.equals(course.courseName) && startDate.equals(course.startDate) && student.equals(course.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(COURSEID, courseName, startDate, weekDuration, student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "COURSEID=" + COURSEID +
                ", courseName='" + courseName + '\'' +
                ", startDate=" + startDate +
                ", weekDuration=" + weekDuration +
                ", student=" + student +
                '}';
    }
}
