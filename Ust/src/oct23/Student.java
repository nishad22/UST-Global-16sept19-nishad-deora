package oct23;
//final example
public class Student {
String name;
int rollno;
final String cname = "Qspiders";
final int cid;
Student() {
	this.cid = 300;
}
Student(String name,int rollno,int cid){
	this.name = name;
	this.rollno = rollno;
	this.cid = cid;
}
final void printDetails() {
	System.out.println("hi, "+name+"your rollno. is "+rollno+"Welcome to "+cname);
}
final void printDetails(int a) {
	System.out.println("hi, "+name+" your rollno. is "+rollno+"  Welcome to "+cname+" "+a);
}

}

