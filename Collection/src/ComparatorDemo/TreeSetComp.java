package ComparatorDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetComp {

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
		
		Employee e4 = new Employee();
		e4.id=30;
		e4.name="Jaggu";
		e4.salary=45000;
		
		List<Employee> lst =  new ArrayList<>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		
		Comparator<Employee> ctr= new EmpName();//upcast
		TreeSet<Employee> ts = new TreeSet<Employee>(ctr);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		for (Employee emp : ts) {
			System.out.println(emp.name+"     "+emp.salary);
		}
	}

}
