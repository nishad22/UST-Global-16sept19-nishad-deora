package Ipl;

public class Player {
	String name;
	int jer_num;
	
	public Player(int jer_num,String name) {
		this.jer_num=jer_num;
		this.name=name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.jer_num;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.hashCode()==obj.hashCode())
			return true;
		else
			return false;
	}
}
