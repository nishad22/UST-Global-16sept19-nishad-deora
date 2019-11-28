package ProductSet;

public class ProhashSet {
	int pid;
	String ptype;
	double qty,price;
	
	public ProhashSet(int pid,String ptype,double qty,double price) {
		this.pid=pid;
		this.ptype=ptype;
		this.qty=qty;
		this.price=price;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.pid +"  "+this.qty+"   "+this.ptype+" = "+this.price+" Rs. ";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.pid;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this.hashCode()==obj.hashCode())
			return true;
		else
			return false;
	}
}
