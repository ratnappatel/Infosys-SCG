package com.infy.maps;

public class Student implements Comparable<Student> {
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
	public String toString() {
		return "\nStudent [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	@Override
	public int compareTo(Student s) {
		int res=s.rollno-this.rollno;
		return res;
	}
	

}
