package ComparatorDemo;

import java.util.Comparator;

public class EmpSal implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		Double d1 =e1.salary;
		return d1.compareTo(e2.salary)*-1;
	}
}
