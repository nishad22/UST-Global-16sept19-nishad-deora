package com.ustglobal.list.Student;

public class Student implements Comparable <Student> {
	int id;
	String name;
	double prec;

	public Student(int id, String name, double prec) {
		super();
		this.id = id;
		this.name = name;
		this.prec = prec;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", prec=" + prec + "]";
	}
//Invalid	
//	public int compareTo(Student s) {
//		if(this.id < s.id) {
//			return 1;
//		} else if(this.id < s.id) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}

	@Override
	public int compareTo(Student s) {
//		if(name.equalsIgnoreCase(s.name)) {
//			return 1;
//		} else if(name.equalsIgnoreCase(s.name)) {
//			return -1;
//		}else {
//			return 0;
//		}
//		String p = this.name.toLowerCase();
//		String q = s.name.toLowerCase();
//		return (p.compareToIgnoreCase(q));
		
		Integer i = this.id;
		Integer j = s.id;
		return (i.compareTo(j));
	}
	

}
