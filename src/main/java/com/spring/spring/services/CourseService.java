package com.spring.spring.services;

import java.util.List;

import com.spring.spring.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(int i);

	public Object addCourse(Course course);

	public Course updateCourse(Course course);

	public String courseDelete(int courseId);

}
