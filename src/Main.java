import java.util.Scanner;
public class Main {	
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int input = 0,input2;
		while (input != -1)
		{
			input2 = 0;
			System.out.println("Welcome to Classic Cryptosystems");
			System.out.println("1. Shift Cipher");
			System.out.println("2. Hill Cipher");
			System.out.println("3. ");
			System.out.println("-1. To exit program");
			System.out.print("Please select option from menu: ");
			input = key.nextInt();
			if (input == 1)
			{
				while(input2 != -1)
				{
					System.out.println("1. Encrypte Plain text (Shift Cipher)");
					System.out.println("2. Decrypte encrypted text (With key)");
					System.out.println("3. Decrypte encrypted text (W/O key)");
					System.out.println("-1. Exit to Main Menu");
					System.out.print("Please select option from menu: ");
					input2 = key.nextInt();
					if (input2 == 1)
						ShiftCipher.EncrypteShiftCipher(key);
					else if (input2 == 2)
						ShiftCipher.DecrypteShiftCipherKey(key);
					else if (input2 == 3)
						ShiftCipher.DecrypteShiftCipher(key);
					else if (input2 != -1)
						System.out.print("Error: invalid input");
					
				}
			}
			if(input == 2)
			{
				while(input2 != -1)
				{
					
				}
			}
			if(input == 3)
			{
				while(input2 != -1)
				{
					
				}
			}
			if(input == -1)
			{
				System.out.print("Program Closing.....");
			}
			else
				System.out.println("Invalid entry");
		}
	}
}
