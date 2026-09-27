package com.example.springbootstrat.controller;

import com.example.springbootstrat.entity.Student;
import com.example.springbootstrat.service.StudentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // 查所有学生
    @GetMapping
    public List<Student> list() {
        return studentService.findAll();
    }

    // 按 id 查一个学生
    @GetMapping("/{id}")
    public Student get(@PathVariable Long id) {
        return studentService.findById(id);
    }

    // 新增学生
    @PostMapping
    public Student add(@RequestBody Student student) {
        return studentService.save(student);
    }

    // 修改学生
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return studentService.update(id, student);
    }

    // 删除学生
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentService.delete(id);
    }
}