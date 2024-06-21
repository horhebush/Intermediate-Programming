package Lecture;
import java.io.IOException;
public class ErrorHandling {

	public static void main(String[] args) {
		String num = "100"; //null NumberFormatException
		int x = 5000, y = 0;
		
		try
		{
			//this statement that possible to get an error
			y = Integer.parseInt(num) / x;
		
		} 
		catch(NumberFormatException | ArithmeticException)
		{
			System.out.printf("May Error: %s\n", e.getMessage());
		}
		catch(Exception e)
		{
			System.out.printf("May Error: %s\n", e.getMessage());
		}
		finally
		{
			System.out.printf("Ang Result: %d\n", y);
		}

	}

}
