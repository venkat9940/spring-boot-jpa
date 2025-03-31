package com.deekshith.springboot.spring_boot_jpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.deekshith.springboot.spring_boot_jpa.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS", "Deekshith"));
		repository.insert(new Course(2, "Learn Azure", "Deekshith"));
		repository.insert(new Course(3, "Learn GCP", "Deekshith"));

		repository.deleteById(1);
		System.out.println(repository.findBy(2));
		System.out.println(repository.findBy(3));

	}

}
