package lambdaexpression.string;

public class TestString {
	public static void main(String[] args) {
		AddString as =  (name)->{ 
			name.toUpperCase();
			return name;
		};
		String st = as.addString("Nishad");
		System.out.println(st);

		AddString as1 = (name)->{
			System.out.println(name.toLowerCase());
			return name;
		};
		String st1 = as1.addString("Rani");
		System.out.println(st1);
	}
}
