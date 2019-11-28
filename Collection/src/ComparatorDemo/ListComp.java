package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComp {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id=10;
		e1.name="Guldu";
		e1.salary=25000;
		
		Employee e2 = new Employee();
		e2.id=20;
		e2.name="Raj";
		e2.salary=35000;
		
		Employee e3 = new Employee();
		e3.id=30;
		e3.name="Jaggu";
		e3.salary=45000;
		
		List<Employee> lst =  new ArrayList<>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		
		Comparator<Employee> ctr= new EmpSal();//upcast
		Collections.sort(lst,ctr);
		for (Employee e : lst) {
			System.out.println(e.name+"   "+e.salary);
			
		}
	}

}
