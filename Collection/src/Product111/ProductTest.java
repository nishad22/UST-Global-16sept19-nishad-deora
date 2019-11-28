package Product111;

import java.util.LinkedList;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		p1.setQty(100);
		p1.setPrice(20000);
		p1.setType("Pen");
		
		p2.setQty(200);
		p2.setPrice(30000);
		p2.setType("FaceWash");
		
		LinkedList<Product> lnk = new LinkedList<Product>();
		lnk.add(p1);
		lnk.add(p2);
		
		for(Product p:lnk)
		{
			System.out.println(p);
		}
		
		for (int i = 0; i < lnk.size(); i++) {
			Product p = lnk.get(i);
			System.out.println(p);
		}
	}
}
