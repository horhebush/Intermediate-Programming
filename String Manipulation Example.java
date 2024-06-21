package Laboratory;
import java.util.Scanner;

public class LongQuiz1 {

    public static void main(String[] args) {
        Scanner StringManipulator = new Scanner(System.in);
        System.out.print("Enter Any String: ");
        String input = StringManipulator.nextLine();

        int numbers = 0;
        int symbols = 0;

        for (char c : input.toCharArray()) 
        {
            if (Character.isDigit(c)) 
            {
                numbers++;
            } else if (!Character.isLetter(c) && !Character.isWhitespace(c)) 
            {
                symbols++;
            }
        }

        String reversed = new StringBuilder(input).reverse().toString();

        StringManipulator.close();
        
        System.out.println("Numbers in String:: " + numbers);
        System.out.println("Special Character in String: " + symbols);
        System.out.println("The Reverse string is: " + reversed);
    }
}

