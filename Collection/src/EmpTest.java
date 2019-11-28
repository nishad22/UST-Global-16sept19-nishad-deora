import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class EmpTest {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(1,"Nishad",25000);
		Employee e2 = new Employee(2,"Atul",35000);
		Employee e3 = new Employee(3,"Harsh",45000);
		Employee e4 = new Employee(4,"Rajat",55000);
		
		ArrayList<Employee> lst= new ArrayList<Employee>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		//System.out.println(lst);
		for(Employee str:lst)
		{
			System.out.println(str);
		}
		
		for (int i = 0; i < lst.size(); i++) {
			//System.out.println(lst);
			Employee emp = lst.get(i);
			System.out.println(emp);
		}
		
		
		
		
	}

}
