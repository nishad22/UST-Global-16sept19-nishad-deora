import java.util.*;

public class TestSet {
	public static void main(String args[]) {
		TreeSet ts = new TreeSet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Set1:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			ts.add(m);
		}
		// System.out.print(ts)10000 20000 30000 40000 50000 60000 30000 80000 90000 10000 20000;
		Object o = null;
		Iterator itr = ts.iterator();
		String str = "";
		
		System.out.print("{");
		while (itr.hasNext()) {
			StringBuilder builder = new StringBuilder(itr.next().toString());
			str = builder.append(",").toString();
			System.out.print(str.substring(0, str.length() - 1));
		
		}
		
		System.out.println("}");
		
		System.out.println();

		/*---------------------------------------------------*/
		
		  TreeSet ts1 = new TreeSet(); 
		  System.out.println("Enter size of Set2:"); 
		  int a= sc.nextInt(); 
		  System.out.println("Enter the elements:"); 
		  for(int i=0;i<a;i++) 
		  { 
			  int b = sc.nextInt(); 
			  ts1.add(b); 
		  } 
		  System.out.println(ts1);
		  /*----------------------intesection---------------------------------*/
		  Set and = new TreeSet(ts); 
		  and.retainAll(ts1); 
		  System.out.println(and);
		  /*----------------------union---------------------------------*/ 
		  Set or = new TreeSet(ts); 
		  or.addAll(ts1); 
		  System.out.println(or);
		  /*----------------------xor---------------------------------*/ 
		  Set xor = new TreeSet(ts); 
		  xor.addAll(ts1); 
		  // a.retainAll(b); 
		  xor.removeAll(and);
		  System.out.println(xor); 
		  /*---------------------set1 compliment---------------------------------*/ 
		  Set ab = new TreeSet(ts);
		  ab.removeAll(and); 
		  System.out.println(ab); 
		  /*---------------------set2 compliment---------------------------------*/ 
		  Set ba = new TreeSet(ts1);
		  ba.removeAll(and); 
		  System.out.println(ba);
	}
	
}
