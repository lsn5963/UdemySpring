package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS Now1!", "in28minutes"));
        repository.insert(new Course(2, "Learn AWS Now2!", "in28minutes"));
        repository.insert(new Course(3, "Learn AWS Now3!", "in28minutes"));

        repository.deleteById(1);
    }
}
