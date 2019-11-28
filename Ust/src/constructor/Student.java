package constructor;

public class Student {
	String name ;
	int id;
	static String colname = "KITS" ;
	String dept;
	double cgpa;
	Student (String name,int id,String dept,double cgpa) {
		this.name = name;
		this.id= id;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	public void studDetails() {
		System.out.println("[" + name + " ," + colname + " ,"+id + " ," + dept + " ," + cgpa + "]");
	}
}
