package edu.kh.review.model.vo;

public class Student {
 private int studentId;
 private String name;
 private int grade;
 private int classNum;
 private String gender;

  
 public Student() {}
	
 public Student(int studentId, String name, int grade,int classNum,String gender) {
	 this.grade = grade;
	 this.studentId = studentId;
	 this.name = name;
	 this.grade = grade;
	 this.classNum = classNum;
	 this.gender = gender;
 }

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getGrade() {
	return grade;
}

public void setGrade(int grade) {
	this.grade = grade;
}

public int getClassNum() {
	return classNum;
}

public void setClassNum(int classNum) {
	this.classNum = classNum;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return  studentId + " / " + name + " / " + grade + " / "+ classNum + " / " + gender ;
}
}
