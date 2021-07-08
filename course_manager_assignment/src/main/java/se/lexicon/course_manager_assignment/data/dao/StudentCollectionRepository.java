package se.lexicon.course_manager_assignment.data.dao;



import se.lexicon.course_manager_assignment.data.sequencers.StudentSequencer;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;


public class StudentCollectionRepository implements StudentDao {

    private Collection<Student> students;


    public StudentCollectionRepository(Collection<Student> students) {
        this.students = students;
    }

    @Override
    public Student createStudent(String name, String email, String address) {
        int STUDENTID = StudentSequencer.nextStudentId();
        Student student = new Student(STUDENTID, name, email, address);
        students.add(student);
        return student;
    }

    @Override
    public Student findByEmailIgnoreCase(String email) {
        for(Student student:students){
            if(student.getEmail().equalsIgnoreCase(email)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Collection<Student> findByNameContains(String name) {
        HashSet<Student> allStudentNamesMatched = new HashSet<>();
        for(Student student : students) {
            if (name.contains(student.getName())) {
                allStudentNamesMatched.add(student);
            }
        }
        return allStudentNamesMatched;
    }

    @Override
    public Student findById(int id) {
        for(Student student:students){
            if(student.getSTUDENTID()==id){
                return student;
            }
        }
        return null;
    }

    @Override
    public Collection<Student> findAll() {
        HashSet<Student> allStudents = new HashSet<>();
        allStudents.addAll(students);
        return allStudents;
    }

    @Override
    public boolean removeStudent(Student student) {
        students.remove(student);
        return false;
    }

    @Override
    public void clear() {
        this.students = new HashSet<>();
    }
}
