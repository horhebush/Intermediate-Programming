package Lecture;

public class ArithmeticException {

	public static void main(String[] args) {
		{
			int x = 10;
			int y = 2;
			
			try
			{
				int answer = x/y;
				System.out.println("The Answer is: " + answer);
				
			}
			
			catch(Exception e)
			{
				System.out.println("Error in Calculation \n");
				System.out.println("Please Enter a correct value for the arithmetic operation:\n" + e);
			}
		}
	}

}
