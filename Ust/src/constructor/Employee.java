package constructor;

public class Employee {
String name;
int eid;
String aadhar;
Employee(String name , int eid ) {
	this.name = name ; 
	this.eid = eid;
//	this("Nishad",101);
}
public Employee(String name , int eid ,String aadhar) {
	this.name = name ; 
	this.eid = eid;
	this.aadhar = aadhar;
	
}
public Employee( int eid ,String name) {
	this.name = name ; 
	this.eid = eid;
	
}
void printDetails() {
	System.out.println(name + " " + eid +" "+ aadhar);
}

public static void main(String[] args) {
	Employee e1 = new Employee("Rashika",22);
	e1.printDetails();
	Employee e2 = new Employee(23,"Mansi");
	e2.printDetails();
	Employee e3 = new Employee("Kirti",24,"1234-4567-8901");
	e3.printDetails();
}
}
