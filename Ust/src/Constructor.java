
public class Constructor {
	int num;
	Constructor(int num) {
	System.out.println("this is Nishad");
	this.num = num;	
	}
	
	Constructor(Constructor c) {
		System.out.println("this is me");
		num = c.num;
	}
	public String toString() {
		return "(" + this.num + "," + this.num + ")";
	}
public static void main(String[] args) {
	Constructor c = new Constructor(10); 
	Constructor c1 = new Constructor(c);
	System.out.println(c1);
	view();
}
static void view() {
	System.out.println("Hello World");
}
}
