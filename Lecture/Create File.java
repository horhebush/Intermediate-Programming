package Lecture;
import java.io.File;
public class CreateFile {

	public static void main(String[] args) {
		File MyFile = new File("SirJay.txt");
		try 
		{
			boolean myValue = MyFile.createNewFile();
			if (myValue)
			{
				System.out.println("New File is Created");
			}
			else
			{
				System.out.println("File is already Exist");
			}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
