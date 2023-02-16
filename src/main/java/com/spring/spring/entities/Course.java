package com.spring.spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int courseId;
	private String courseName;
	private String courseDiscription;
	
	public Course() {
		
	}
	
	public Course(int courseId, String courseName, String courseDiscription) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDiscription = courseDiscription;
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDiscription() {
		return courseDiscription;
	}
	public void setCourseDiscription(String courseDiscription) {
		this.courseDiscription = courseDiscription;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDiscription="
				+ courseDiscription + "]";
	}
	
	

}
