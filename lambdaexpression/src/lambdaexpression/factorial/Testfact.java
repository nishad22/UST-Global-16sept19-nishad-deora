package lambdaexpression.factorial;

public class Testfact {
	public static void main(String[] args) {
		IFactorial i = (num)->{
			int pro = 1;
			for (int j = 1; j <= num; j++) {
				pro = pro * j;
			}
			return pro;
		};
		int num = i.fact(5);
		System.out.println(num);
	}

}
