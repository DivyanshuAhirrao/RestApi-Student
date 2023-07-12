package org.jspiders.studentrest.controller;

import org.jspiders.studentrest.model.Student;
import org.jspiders.studentrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    private StudentService service;

    @PostMapping("/students")
    public void addStudent(@RequestBody Student s) {
        service.addStudent(s);
    }
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
    @GetMapping("/studentId/{id}")
    public Student getStudentById(@PathVariable(value = "id") int id){
       return service.getStudentById(id);
    }

    @GetMapping("/studentbyName/{name}")
    public List<Student> getStudentByName(@PathVariable(value = "name") String name){
        return service.getStudentByName(name);
    }
    @GetMapping("/studentByStream/{stream}")
    public List<Student> getStudentByStream(@PathVariable(value = "stream") String stream){
        return service.getStudentByStream(stream);
    }
    @GetMapping("/studentsbyCourse/{course}")
    public List<Student> getStudentByCourse(@PathVariable(value = "course") String course){
        return service.getStudentByCourse(course);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@PathVariable(value = "id") int id,@RequestBody Student s){
        service.updateStudent(id,s);
    }




    @PatchMapping("/students/{id}")
    public void deleteStudentById(@PathVariable(value = "id") int id){
        service.deleteStudentById(id);
    }

    @PatchMapping("/students/{course}")
    public void deleteStudentByCourse(@PathVariable(value = "course") String course){
        service.deleteStudentByCourse(course);
    }

}
