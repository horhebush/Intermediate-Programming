package Laboratory;
import java.util.Scanner;

public class Activity3 {

		private static Scanner scn = new Scanner(System.in);
		
		static void appendString() {
			StringBuilder userString = new StringBuilder("\nEmail Address: ");
			
			System.out.print("\nUsername: ");
			String userInput1 = scn.nextLine();
			
			System.out.print("Email Symbol and Server: ");
			String userInput2 = scn.nextLine();
			
			System.out.print("Domain: ");
			String userInput3 = scn.nextLine();
			
			userString.append(userInput1);
			userString.append(userInput2);
			userString.append(userInput3);
			
			System.out.println(userString.toString());
					
		}
		
		static void insertString( ) {
			StringBuilder userString = new StringBuilder("\nAnd if,  not enough, for me to  you");
			
			System.out.print("\nGuess the lyrics: ");
			String userInput1 = scn.nextLine();
			
			System.out.print("Complete the lyrics: ");
			String userInput2 = scn.nextLine();
			
			userString.insert(9, userInput1);
			userString.insert(41, userInput2);
			
			System.out.println(userString.toString());
		}
		
		static void deleteString() {
			System.out.print("\nAny String: ");
			String userInput1 = scn.nextLine();
			
			StringBuilder userString = new StringBuilder(userInput1);
			
			System.out.println("\nInput range of deletion (x, y)");
			System.out.print("Input range of deletion (x): ");
			int x = scn.nextInt();
			
			System.out.print("Input range of deletion (y): ");
			int y = scn.nextInt();
			
			userString.delete(x,y);
			System.out.println();
			System.out.println(userString.toString());
		}

		static void repalceString() {
			StringBuilder userString = new StringBuilder("\nAnd if, forever's not enough, for me to love you");
			
			System.out.println("\nAnd if, forever's not enough, for me to love you");
			
			System.out.print("\nInput desired word: ");
			String userInput1 = scn.nextLine();
			
			System.out.println("Input range of Replacement (x, y)");
			
			System.out.print("Input range of Replacement (x): ");
			int x = scn.nextInt();
			
			System.out.print("Input range of Replacement (y): ");
			int y = scn.nextInt();
			
			System.out.println();
			
			userString.replace(x,y, userInput1);
			
			System.out.println(userString.toString());
		}
		
		static void reveseString() {
			System.out.print("\nAny String: ");
			String userInput1 = scn.nextLine();
			
			System.out.println();
			
			StringBuilder userString = new StringBuilder(userInput1);
			
			userString.reverse();
			
			System.out.println(userString.toString());
		}
		
		public static void main(String[] args) {
		    int choice;
		    do {
		        System.out.println("\nChoose an option:\n");
		        System.out.println("1. Append String");
		        System.out.println("2. Insert String");
		        System.out.println("3. Delete String");
		        System.out.println("4. Reverse String");
		        System.out.println("5. Replace String");
		        System.out.println("6. Exit");
		        System.out.print("\nEnter your choice: ");
		        choice = scn.nextInt();
		        scn.nextLine();

		        switch (choice) {
		            case 1:
		                appendString();
		                break;
		            case 2:
		                insertString();
		                break;
		            case 3:
		                deleteString();
		                break;
		            case 4:
		                reveseString();
		                break;
		            case 5:
		                repalceString();
		                break;
		            case 6:
		                System.out.println("\nExiting...");
		                break;
		            default:
		                System.out.println("\nInvalid choice. Please try again.");
		                break;
		        }
		    } while (choice != 6);
		    scn.close();
		}
}


