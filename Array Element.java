package Laboratory;
import java.util.Scanner;
public class Activity1 {

	public static void main(String[] args) {
		
		String [] myArray = {"One", "Two", "Three"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Index: ");
		int n = scan.nextInt();
		scan.close();
		
		try
		{
			System.out.println("\nArray Element: " + myArray[n]);
			System.out.println("\nException: Caught");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\nIndex " + n + " is out of bounds as the index length of the Array is only 3.\n");
			System.out.println("\t\t\tQuitting...");
		}

	}

}
