import java.util.Scanner;
public class Main {	
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int input = 0;
		while (input != -1)
		{
			System.out.println("Welcome to Classic Cryptosystems");
			System.out.println("1. Shift Cipher");
			System.out.println("2. Hill Cipher");
			System.out.println("3. ");
			System.out.println("-1. To exit program");
			System.out.print("Please select option from menu: ");
			input = key.nextInt();
			if (input == 1)
			{
				while(input != -1)
				{
					System.out.println("1. Encrypte Plain text (Shift Cipher)");
					ShiftCipher.EncrypteShiftCipher(key);
					System.out.println("2. Decrypte encrypted text (With key)");
					ShiftCipher.DecrypteShiftCipherKey(key);
					System.out.println("3. Decrypte encrypted text (W/O key)");
					System.out.println("-1. Exit to Main Menu");
					System.out.print("Please select option from menu: ");
					input = key.nextInt();
					
				}
			}
			if(input == 2)
			{
				while(input != -1)
				{
					
				}
			}
			if(input == 3)
			{
				while(input != -1)
				{
					
				}
			}
			if(input == -1)
			{
			
			}
			else
				System.out.println("Invalid entry");
		}
		/*
		Counter.IntCount(key, true);
		char x[] = key.next().toCharArray();
		int y[];
		y = Convert.CharInt(x);
		for (int z=0; z<y.length;z++)
		System.out.print(y[z]+"   ");
		/*
		ShiftCipher.Menu(key);
		key.nextLine();
		Counter.CharCount(key.nextLine().toCharArray(),true);	
		System.out.println("example3");
		key.close();
		*/
	}
}
