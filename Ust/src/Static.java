
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Btm  b = new Btm();
		b.swipe();
		System.out.println("BTM = "+ b.count);
		
		Btm b1 = new Btm();
		System.out.println("Total count of Btm :" + Btm.totalcount);

	}

}
