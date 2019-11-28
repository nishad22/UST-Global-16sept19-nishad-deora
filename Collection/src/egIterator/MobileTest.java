package egIterator;
import java.util.Iterator;
import java.util.Vector;
public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile("Xiomi","Black",15000);
		Mobile m2 = new Mobile("Samsung","Blue",15000);
		Mobile m3 = new Mobile("Nokia","White",15000);
		Mobile m4 = new Mobile("Apple","Gold",15000);
		
		Vector<Mobile> vec = new Vector<Mobile>();
		vec.add(m1);
		vec.add(m2);
		vec.add(m3);
		vec.add(m4);
		
		Iterator <Mobile> itr = vec.iterator();
		while (itr.hasNext()) {
			Mobile mobile = itr.next();
			System.out.println(mobile);
			
		}

	}

}
