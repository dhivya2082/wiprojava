package wipro;

public class program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=10 ; i<99 ; i++) {
			int c = 0;
			for (int j=2 ; j<=i/2 ; j++) {
				if(i%j==0) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.print(" " + i);
			}
		}
	}

}
