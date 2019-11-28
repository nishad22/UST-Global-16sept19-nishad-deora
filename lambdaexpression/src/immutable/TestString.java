package immutable;

public class TestString {
public static void main(String[] args) {
	MyString ms = new MyString(12,"renu");
	System.out.println(ms.getName());
	System.out.println(ms.getRollno());
	System.out.println(ms);
	
	System.out.println("=========After Change==========");
	MyString ms1 = new MyString(13,"anu");
	System.out.println(ms1.getName());
	System.out.println(ms1.getRollno());
	System.out.println(ms1);
	MyString m = ms.changeContent(20, "chotu");
	System.out.println(m);
}
}
