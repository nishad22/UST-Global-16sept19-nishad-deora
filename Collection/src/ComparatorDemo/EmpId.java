package ComparatorDemo;

import java.util.Comparator;

public class EmpId implements Comparator<Employee> {
 @Override
public int compare(Employee e1, Employee e2) {
	// TODO Auto-generated method stub
	Integer e1id=e1.id;
	return e1id.compareTo(e2.id);
	
}
}
