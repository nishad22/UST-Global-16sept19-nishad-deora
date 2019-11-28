package constructor;

public final class Final {
	final void add() {
		System.out.println("add() method");
	}
	final void add(int a) {
		System.out.println("sub() method");
	}
	public static void main(String[] args) {
		Final f = new Final();
		Final f1 = new Final();
		f.add();
		f.add(10);
		f1.add();
		f1.add(10);
	}
	
}
