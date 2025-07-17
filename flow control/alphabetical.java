package wipro;
import java.util.*;
public class alphabetical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner i = new Scanner(System.in); 
	        char c1 = i.next().charAt(0);
	        char c2 = i.next().charAt(0);

	        if (c1 < c2) {
	            System.out.println(c1 + ", " + c2);
	        }
	        if (c1 > c2) {
	            System.out.println(c2 + ", " + c1);
	        }
	}

}
