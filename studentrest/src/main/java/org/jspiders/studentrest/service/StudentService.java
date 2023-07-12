package org.jspiders.studentrest.service;

import org.jspiders.studentrest.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

    List<Student> studentList = new ArrayList<>();

    {
        studentList.add(new Student(101, "Adams","CS", 78.65,"Data-Science"));
        studentList.add(new Student(102, "Smith","ENTC", 82.95,"Development"));
        studentList.add(new Student(103, "David","MECH", 78.65,"AI"));
    }

    //Add new Student
    public void addStudent(Student s) {
      studentList.add(s);
    }


    //Get all Students
    public List<Student> getAllStudents(){
        return studentList;
    }


    //Get Student by id  (All details)
    public Student getStudentById(int id) {
        Student s = null;
        for (Student stud : studentList) {
            if (stud.getId()==id) {
                s = stud;
            }
        }
        return s;
    }


    //Get Student by name (All details)
    public List<Student> getStudentByName(String name) {
        List<Student> listByName = new ArrayList<>();
        for (Student stud : studentList) {
            if (stud.getName().equals(name)) {
                listByName.add(stud);
            }
        }
        return listByName;
    }

    //Get Student by Stream (names)
    public List<Student> getStudentByStream(String stream) {
        List<Student> listByStream = new ArrayList<>();
        for (Student stud1 : studentList) {
            if (stud1.getStream().equals(stream)) {
                listByStream.add(stud1);
            }
        }
        return listByStream;
    }

    //Get Student by course (name, stream)
    public List<Student> getStudentByCourse(String course) {
        List<Student> listByStream = new ArrayList<>();
        for (Student stud : studentList) {
            if (stud.getCourse().equals(course)) {
               listByStream.add(stud);
            }
        }
        return listByStream;
    }



    //Update Student details by Id

    public void updateStudent(int id, Student s) {
        for (int a =0;a<studentList.size();a++){
            Student stud = studentList.get(a);
            if (stud.getId() == id) {
                studentList.set(a,s);
            }
        }
    }

    //Delete Student by id

    public void deleteStudentById(int id) {
        Iterator<Student> itr = studentList.iterator();
        while (itr.hasNext()){
            if (itr.next().getId()==id){
                itr.remove();
            }
        }
    }

    //Delete Student by course

    public void deleteStudentByCourse(String course) {
        Iterator<Student> itr1 = studentList.iterator();
        while (itr1.hasNext()){
            if (itr1.next().getCourse().equals(course)){
                itr1.remove();
            }
        }
    }

}
