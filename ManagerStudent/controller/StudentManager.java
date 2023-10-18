package ManagerStudent.controller;

import ManagerStudent.repository.IStudentRepository;
import ManagerStudent.repository.StudentRepository;
import ManagerStudent.view.Menu;

public class StudentManager extends Menu<String> {

    private IStudentRepository studentRepository;
    static String[] mc = {"Sort Student", "Display", "Exit"};

    public StudentManager() {
        super("Student Information", mc);
        studentRepository = new StudentRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                studentRepository.sortStudent();
                break;
            }
            case 2: {
                studentRepository.display();
                break;
            }
            case 3:
                System.exit(0);
            default:
        }
    }
}
