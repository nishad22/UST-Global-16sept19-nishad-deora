package lambdaexpression;

public class TestAdd {
public static void main(String[] args) {
	AddInterface ta = (a,b)->(a+b);
	int sum = ta.add(10,20);
	System.out.println(sum);
}
}
