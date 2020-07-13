package com.javaBasics;

import java.util.Calendar;
import java.util.Date;

class Course {
	private int courseId;
	private String courseName;

	public Course(int courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
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

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
}

final class Student {
	private final int studentId;
	private final String studentName;
	private final Date dob;
	private final Course course;

	public Student(int studentId, String studentName, Date dob, Course course) {
		this.studentId = studentId;
		this.studentName = studentName;

		this.dob = new Date(dob.getTime());
		this.course = new Course(course.getCourseId(), course.getCourseName());
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}

	public Course getCourse() {
		return new Course(course.getCourseId(), course.getCourseName());
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + ", course="
				+ course + "]";
	}
}

public class ImmutableClassTest {
	public static void main(String[] args) {
		Course course = new Course(1, "Core Java");
		System.out.println("Initial Course Object - " + course);

		Calendar calendar = Calendar.getInstance();
		calendar.set(2003, 02, 12);
		System.out.println("Initial DOB - " + calendar.getTime());

		Student student = new Student(101, "Ramesh", calendar.getTime(), course);
		System.out.println("Immutable Student Object - " + student);
		System.out.println();

		course.setCourseName("Advance Java");
		System.out.println("Updated Course Object - " + course);

		calendar.set(Calendar.YEAR, 2005);
		System.out.println("Updated DOB - " + calendar.getTime());

		System.out.println("Updated Student Object - " + student);
	}
}