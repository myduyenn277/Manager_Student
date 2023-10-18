package ManagerStudent.repository;

import java.util.List;

import ManagerStudent.dataAccess.StudentDao;
import ManagerStudent.model.Student;

public class StudentRepository implements IStudentRepository{

    @Override
    public List<Student> sortStudent() {
        return StudentDao.Instance().sortStudent();
    }

    @Override
    public void display() {
        StudentDao.Instance().display();
    }
    
}