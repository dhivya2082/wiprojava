package wipro;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = in.nextLine();
        String reversed = "";
        int i = original.length() -1;
        while (i >= 0) {
            reversed += original.charAt(i);
            i--;
        }
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(reversed + " is a palindrome");
        } 
        else {
            System.out.println(original + " is not a palindrome");
        }
    }
}