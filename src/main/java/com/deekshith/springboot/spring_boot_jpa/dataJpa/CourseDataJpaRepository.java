package com.deekshith.springboot.spring_boot_jpa.dataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deekshith.springboot.spring_boot_jpa.course.Course;

public interface CourseDataJpaRepository extends JpaRepository<Course, Long> {

	List<Course> findByName(String name); // we can create custom methods easily (follow naming conventions)

}
