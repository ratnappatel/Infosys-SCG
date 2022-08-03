package com.infy.sets;

public class Student implements Comparable<Student>
{
	private int rollno;
	private String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]\n";
	}
	@Override
	public int compareTo(Student s1) {
	
		/*
		 * int res=s1.rollno-this.rollno; return res;
		 */
		String name1=this.name;
		String name2=s1.name;
		int res=name2.compareTo(name1);
		return res;
	}
	

}
