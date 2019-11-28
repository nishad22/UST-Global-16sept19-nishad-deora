package oct24;

public class Block {
	static int a;
	int b;
	{
		System.out.println("non static block");	
	}
	static {
		a = 1;
		System.out.println("This is static block "+a);
	}
	Block(){
		System.out.println("Block Constructor");
	}
	public static void main(String[] args) {
		System.out.println("HELLO");
		Block b1 = new Block();
		Block b2 = new Block();
	}

	static {
		a = 2;
		System.out.println("This is static block "+a);
	}
}
