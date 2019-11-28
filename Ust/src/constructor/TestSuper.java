package constructor;

public class TestSuper {
	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		System.out.println("*****************");	
		SubClass sub = new SubClass();
		sub.prin();
		sub.getData();
	}
}
