package singleton;

public class Test {
public static void main(String[] args) {
	MySingleton ms = MySingleton.getDbConnection();
	ms.s = "hello";
	System.out.println(ms.hashCode());
	MySingleton ms1 = MySingleton.getDbConnection();
	ms.s = "Hello";
	System.out.println(ms1.hashCode());

	
}
}
