package constructor;

public class Person {
	String name;
	int age;

	Person(String pname , int age) {
		name = pname;
		age = age;
	}
	public static void main(String[] args) {
		Person p = new Person("Nishad",22);
		System.out.println(p.name + p.age);	
	}
}
