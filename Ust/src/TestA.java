
public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstProg fp = new FirstProg();
		fp.cost = 100;
		fp.color = "blue";
		fp.brand = "Cello";
		System.out.println("Cost is " + fp.cost);
		System.out.println("Color is " + fp.color);
		System.out.println("Brand is " + fp.brand);
		fp.write();
		System.out.println("---------------------------------------");
		Van v = new Van();
		v.cost = 400000;
		v.color = "blue";
		System.out.println("Cost of van " + v.cost);
		System.out.println("Color of van " + v.color);
		v.move();
		System.out.println("---------------------------------------");
		Van omni = new Van();
		omni.cost = 300000;
		omni.color = "blue";
		System.out.println("Cost of van " + omni.cost);
		System.out.println("Color of van " + omni.color);
		System.out.println("---------------------------------------");
		Cow c = new Cow();
		c.name = "basanti";
		c.color = "white";
		System.out.println("Cow name is " + c.name);
		System.out.println("Cow name is " + c.color);
		c.eat();
		c.sleep();
		System.out.println("---------------------------------------");
		Cow c1 = new Cow();
		c1.name = "bahubali";
		Cow.color = "black";
		System.out.println("Cow name is " + c1.name);
		System.out.println("Cow name is " + Cow.color);
		c.eat();
		c.sleep();
		Cow.walk();
	}

}
