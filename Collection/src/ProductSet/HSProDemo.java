package ProductSet;

import java.util.HashSet;
import java.util.Iterator;

public class HSProDemo {
	public static void main(String arg[]) {
	ProhashSet p1 = new ProhashSet(45,"Deodrant",2,250);
	ProhashSet p2 = new ProhashSet(3,"Rajma",4,1000);
	ProhashSet p3 = new ProhashSet(2,"Bag",5,225);
	ProhashSet p4 = new ProhashSet(45,"Deodrant",2,250);
	
	HashSet<ProhashSet> set = new HashSet<ProhashSet>();
	 set.add(p1);
	 set.add(p2);
	 set.add(p3);
	 set.add(p4);
	 set.add(null);
	 set.add(null);
	 
	/* for(ProhashSet p : set) {
		 System.out.println(p);
	 }
	*/
	 
	 Iterator <ProhashSet> itr= set.iterator();
	 while(itr.hasNext()) {
		 ProhashSet ps = itr.next();
		 System.out.println(ps);
	 }
}
}