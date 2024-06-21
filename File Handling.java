package Laboratory;
import java.awt.Toolkit;
import java.io.*;
import java.io.FileWriter;
import java.util.*;
public class Activity2 {

	public static void main(String[] args) {
		
		String fileContents [] = new String [5];
		fileContents [0] = "Juan\nLimbo34";
		fileContents [1] = "Alan\n12Laure";
		fileContents [2] = "Kenzo\nVirus26";
		fileContents [3] = "Gabriel\nMacato36";
		fileContents [4] = "Joshua\n78Manalansan";
		
		try 
		{
			Scanner validation = new Scanner(System.in);
			
			System.out.print("Enter Username: ");
			String inputUser = validation.nextLine();
			System.out.print("Enter Password: ");
			String inputPass = validation.nextLine();
			
			for (int i = 0; i < fileContents.length; i++)
			{
				File myFile = new File ("/Users/horhebush/Documents/Files/MyFile" + (i + 1) + ".txt");
				FileWriter myWriter = new FileWriter(myFile);
				myWriter.write(fileContents[i]);
				myWriter.close();
				
				if ((inputUser + "\n" + inputPass).equals(fileContents[i])) 
				{
                    System.out.println("\nYou've successfully entered the program!");
                    validation.close(); 
                    return;
                }
            }
            System.out.println("\nInvalid Username or Password");
            validation.close();
		}
		
		catch (Exception e)
		{
			e.getStackTrace();
		}
		
	}

}
