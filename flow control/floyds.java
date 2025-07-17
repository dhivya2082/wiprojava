package wipro;

public class floyds {

	public String pattern(int line) {
		for(int i=0;i<line;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return "";
	}

}
