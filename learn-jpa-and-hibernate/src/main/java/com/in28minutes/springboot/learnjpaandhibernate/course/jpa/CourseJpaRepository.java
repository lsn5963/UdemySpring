package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(int id){
        return entityManager.find(Course.class, id);
    }
    public void deleteById(int id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
