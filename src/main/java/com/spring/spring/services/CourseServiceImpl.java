package com.spring.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.spring.dao.CourseDao;
import com.spring.spring.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() {
//		list = new ArrayList<Course>();
//		list.add(new Course(1, "B.Tech", "It is Engineering Degree"));
//		list.add(new Course(2, "B.parma", "It is Pharma Degree"));
//		list.add(new Course(3, "B.S.C", "It is a Bachlers Degree"));
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(int courseId) {
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.set(course.getCourseId(), course);
		courseDao.save(course);
		return course;
	}

	@Override
	public String courseDelete(int courseId) {
//		Course result = list.get(courseId);
//		list.remove(courseId);
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
		return entity.getCourseName()+"Data is Deleted";
	}

}
