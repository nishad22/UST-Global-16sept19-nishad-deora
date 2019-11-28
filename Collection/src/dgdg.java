import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class dgdg {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<a.length;i++)
	    {
	        int c=sc.nextInt();
	        a[i]=c;
	    }
	    
	    
	    Arrays.sort(a);
	   
	    int count=0;
	    int c[]=new int[a.length];
	    for(int i=0;i<a.length;i++)
	    {
	        for(int j=0;i<a.length;j++)
	        {
	            if(a[i]==a[j])
	                count++;
	        }
	        if(count>1)
	        {
	            c[i]=a[i];
	        }
	    }
	    for(int i=0;i<c.length;i++)
	    {	
	    	System.out.println(c[i]);
	    }
}
}
