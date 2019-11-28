import java.util.List;
import java.util.ArrayList;
public class ListDemo {

	public static void main(String[] args) {
		List <String> lst = new ArrayList<String>();
		lst.add("Aruna");
		lst.add("Vijay");
		lst.add("Vijay");
		lst.add("Dhoni");
		lst.add("Virat");
		lst.add(null);
		lst.add("Laxmi");	
		System.out.println(lst);
		lst.add(3,"Guldu");
		System.out.println(lst);
		
		List <String> lst1 = new ArrayList<String>();
		lst1.add("dipika");
		lst1.add("alia");
		System.out.println(lst1);
		lst1.addAll(1,lst);
		System.out.println(lst1);
		System.out.println(lst1.get(4));
		System.out.println("Virat index =" + lst1.indexOf("Virat"));
		
		List<String> clrLst = new ArrayList<String>();
		clrLst.add("White");
		clrLst.add("red");
		clrLst.add("blue");
		clrLst.add("yellow");
		System.out.println(clrLst);
		clrLst.add(1,"black");
		System.out.println(clrLst);
		clrLst.set(1,"Orange");
		System.out.println(clrLst);

	}

}
