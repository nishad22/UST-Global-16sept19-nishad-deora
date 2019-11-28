package constructor;

public class TestBus {
public static void main(String[] args) {
	Bus b = new Bus(10,"red");
	b.busDetails();
	Bus b1 = new Bus();
	b1.busDetails();
	Bus b2 = new Bus(50);
	b2.busDetails();
}

}
