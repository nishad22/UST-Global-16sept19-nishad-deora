package constructor;

public class SubClass extends SuperClass {
	String s = "subclass variable";
	SubClass(){
		super();
		System.out.println("SubClass Consturctor");
	}
	
	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.prin();
		prin();
	}
}
