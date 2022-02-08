package com.GradleAPS.Grads.services;

import java.util.List;

import com.GradleAPS.Grads.entities.Course;



public interface CourseService {
     public List<Course> getCourses();
     
     public Course addCourse(Course course);
     
    public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);

	
     
}