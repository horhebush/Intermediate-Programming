package Lecture;
import java.io.FileWriter;

public class FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "My favorite Sports Channel is NBA TV";
		
		try
		{
			FileWriter TextOut = new FileWriter ("/Users/horhebush/Documents/MyNewFile.txt");
			TextOut.write(info);
			System.out.println("Text is already writen in your file");
			TextOut.close();
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}

	}

}
