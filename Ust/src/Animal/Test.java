package Animal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.eat();
		a.sleep();
		System.out.println(a);
		System.out.println("-----------------------------");
		Dog d = new Dog();
		d.bark();
		d.run();
		System.out.println("-----------------------------");
		Tiger t = new Tiger();
		t.roar();
		t.hunt();
		
		
	}

}
