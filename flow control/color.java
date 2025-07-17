package wipro;

public class color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char code = args[0].charAt(0);
	        switch (code) {
	            case 'R': System.out.println("Red"); 
	            break;
	            case 'B': System.out.println("Blue");
	            break;
	            case 'G': System.out.println("Green"); 
	            break;
	            case 'O': System.out.println("Orange"); 
	            break;
	            case 'Y': System.out.println("Yellow");
	            break;
	            case 'W': System.out.println("White");
	            break;
	            default: System.out.println("Invalid Code");
	        }
	}

}
