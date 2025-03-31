package com.deekshith.springboot.spring_boot_jpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.deekshith.springboot.spring_boot_jpa.dataJpa.CourseDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS", "Deekshith"));
		repository.save(new Course(2, "Learn Azure", "Deekshith"));
		repository.save(new Course(3, "Learn GCP", "Deekshith"));

		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));

		System.out.println(repository.findByName("Learn GCP"));

	}

}
