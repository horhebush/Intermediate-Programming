package Laboratory;
import java.util.Scanner;
import java.util.regex.*;

public class Activity4 {

	public static void main(String[] args) {
		{
			try
			{
				Scanner validation = new Scanner(System.in);
				System.out.print("Email: ");
				String emailAddress = validation.nextLine();
				System.out.print("Number: ");
				String number = validation.nextLine();
				
				Pattern emailP = Pattern.compile("[a-z0-9]+@[a-z]+\\.[a-z]");
				Matcher emailM = emailP.matcher(emailAddress);
				
				Pattern numberP = Pattern.compile("^\\+63-9[0-9]{2}-[0-9]{3}-[0-9]{4}");
				Matcher numberM = numberP.matcher(number);
				
				validation.close();
				
				boolean matchFound = emailM.find();
				if (matchFound)
				{
					System.out.print("\n\tValid Email Address");
				}
				else
				{
					System.out.print("\n\tInvalid Email Address");
				}
				
				if(numberM.matches() == true)
				{
					System.out.println("\n\n\tValid Mobile Number");
				}
				else
				{
					System.out.println("\n\n\tInvalid Mobile Number");
				}
			}
			catch (Exception e)
			{
				System.out.println("e.getMessage()");
			}
		}

	}

}
