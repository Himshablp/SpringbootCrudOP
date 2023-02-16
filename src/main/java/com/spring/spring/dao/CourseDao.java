package com.spring.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.spring.entities.Course;

public interface CourseDao extends JpaRepository<Course,Integer> {
	

}
