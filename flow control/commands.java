package wipro;

public class commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  if (args.length == 0) {
	            System.out.println("No Values");
	        }
	        if (args.length > 0) {
	            System.out.print(args[0]);
	            for (int i = 1; i < args.length; i++) {
	                System.out.print(", " + args[i]);
	            }
	        }
	}
}
