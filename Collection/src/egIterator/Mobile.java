package egIterator;

public class Mobile {
	String model,clr;
	int price;
	Mobile(String m,String c,int p)
	{
		this.model=m;
		this.clr=c;
		this.price=p;
	}
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", clr=" + clr + ", price=" + price + "]";
	}
	
}
