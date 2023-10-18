package ManagerStudent.repository;

import java.util.List;

import ManagerStudent.model.Student;

    public interface IStudentRepository {
    List<Student> sortStudent();
    void display();

}
