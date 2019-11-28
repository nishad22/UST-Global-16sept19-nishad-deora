package PassportSet;

public class Passport {
	String passName,name;
	
	public Passport(String passName,String name) {
		this.passName = passName;
		this.name=name;
	}
	@Override
	public String toString() {
		return this.passName +"   "+this.name; 
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.passName.hashCode();
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
