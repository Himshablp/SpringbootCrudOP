package com.spring.spring.controller;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.entities.Course;
import com.spring.spring.services.CourseService;
import com.zaxxer.hikari.util.ClockSource.Factory;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "This is Our HOME Page";
	}
	
	//get the courses 
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	//get the single Id Course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Integer.parseInt(courseId));
		
	}
	
	//add new Course
	@PostMapping(path="/courses")
	public Course addCourse(@RequestBody Course course) {
		return (Course) this.courseService.addCourse(course);		
	}
	
	//Update the Value
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	//Delete the Value
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable int courseId) {
		return this.courseService.courseDelete(courseId);
	}
	
	

}
