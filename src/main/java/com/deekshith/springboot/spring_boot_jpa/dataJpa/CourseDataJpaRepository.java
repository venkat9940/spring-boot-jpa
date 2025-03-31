package com.deekshith.springboot.spring_boot_jpa.dataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deekshith.springboot.spring_boot_jpa.course.Course;

public interface CourseDataJpaRepository extends JpaRepository<Course, Long> {

}
