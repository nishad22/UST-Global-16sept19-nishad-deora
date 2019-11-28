
public class Employee {
	int id;
	String name;
	int sal;
	public Employee(int i,String n,int s)
	{
		this.id=i;
		this.name=n;
		this.sal=s;
	}
	/*public static void main(String[] args) {
		Employee e = new Employee(1,"Nishad",25000);
		System.out.println(e.id +" "+ e.name+" "+ e.sal);
	}*/
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

}
