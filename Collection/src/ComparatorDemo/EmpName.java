package ComparatorDemo;

import java.util.Comparator;

public class EmpName  implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareToIgnoreCase(e2.name)*-1;
	}
	
}
