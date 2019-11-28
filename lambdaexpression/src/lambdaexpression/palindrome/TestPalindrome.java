package lambdaexpression.palindrome;

public class TestPalindrome {
public static void main(String[] args) {
	Ipalindrome ip = (num) -> {
		int pro = 0;
		int i = 1;
		while(num !=0 ) {
			int r = num%10;
			pro = pro * 10 + r;
			num = num/10;
		}
		return pro;
	};
	int n = ip.palindrome(1234);
	System.out.println(n);
}
}
