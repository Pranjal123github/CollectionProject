package com.pranjali.collection;

public class Student implements Comparable<Student> {

	private int id;
	private String stuName;
	private int age;
	private int marks;

	public Student(int id, String stuName, int age, int marks) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.age = age;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", age=" + age + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student student) {
//		if (id == student.id) {
//			return 0;
//
//		} else if (id > student.id) {
//			return 1;
//		} else {
//			return -1;
//		}
		return stuName.compareTo(student.stuName);
	}
	

}
