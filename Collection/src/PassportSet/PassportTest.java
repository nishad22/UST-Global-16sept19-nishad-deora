package PassportSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PassportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passport p1 = new Passport("IND12344","NISHAD");
		Passport p2 = new Passport("IND44422","HARSH");
		Passport p3 = new Passport("IND55546","ATUL");
		Passport p4 = new Passport("IND66661","RAJJO");
		
		LinkedHashSet <Passport> pt = new LinkedHashSet<Passport>();
		pt.add(p1);
		pt.add(p2);
		pt.add(p3);
		pt.add(p4);
		
		Iterator <Passport>itr = pt.iterator();
		while(itr.hasNext()) {
			Passport p = itr.next();
			System.out.println(p);
		}
		
		
	}

}
