package interfac;

public class BMW implements AutoMobile,AutoMobileWithAbs{
public int gear() {
	System.out.println("gear() BMW");
	return 10;
}
public void gps() {
	System.out.println("gps() BMW");
}
public void abs() {
	System.out.println("abs() of BMW");
}
}
