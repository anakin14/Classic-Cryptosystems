public class ShiftCipher {
	public static void Menu()
	{
		int input = 0;
		while (input != -1)
		{
			System.out.println("Welcome to Shift Cipher Master");
			System.out.println("1. Encrypte Plain text (Shift Cipher)");
			System.out.println("2. Decrypte encrypted text (With key)");
			System.out.println("3. Decrypte encrypted text (W/O key)");
			System.out.println("-1. To exit program");
			System.out.print("Please select option in menu: ");
			input = Main.key.nextInt();
			if (input == 1)
				ShiftCipher.EncrypteShiftCipher();
			else if (input == 2)
				ShiftCipher.DecrypteShiftCipherKey();
			else if (input == 3)
				ShiftCipher.DecrypteShiftCipher();
			else if (input != -1)
				System.out.print("Invalid Input");
			else
				System.out.print("Shuting Down");
		}
		
	}
	public static char[] Shift (char[] nxt, int k)//adds to the values of each char
	{
		int[] values = Convert.CharInt (nxt);
		int y=  values.length;
		for (int x = 0; x < y; x++)
			values[x] = (values[x] + k)%26;
		nxt = Convert.IntChar(values);
		return(nxt);
	}
	public static void EncrypteShiftCipher()
	{
		String sentence;
		int k;
		char[] nxt = null;
		
		sentence = Convert.InputString();
		System.out.print("please enter the key value: ");
		k = Main.key.nextInt();//inputs k value to be encrypted
		
		nxt = sentence.toCharArray(); //Separates string to array of char
		nxt = Shift(nxt, k);
		sentence = new String(nxt);
		System.out.println(sentence);
	}
	public static void DecrypteShiftCipherKey()
	{
		String sentence;
		int k;
		char[]nxt = null;
		sentence = Convert.InputString();
		System.out.print("please enter the key value: ");
		k = Main.key.nextInt();	//inputs k value to be encrypted
		
		nxt = sentence.toCharArray(); //Separates string to array of char
		nxt = Shift(nxt, 26-k);
		System.out.println(nxt);
	}
	public static void DecrypteShiftCipher()
	{
		String sentence;
		int k,x;
		char[]nxt = null,nxtt = null;
		
		System.out.print("please insert text to be decrypted: ");
		sentence = Convert.InputString();
		nxt = sentence.toCharArray();
		for(x=1; x<=25; x++)
		{
			nxtt = Shift(nxt, (x-26)*-1);
			System.out.print(x+ "  ");
			System.out.println(nxtt);
			//for (x=0; x<=nxtt.length -1; x++)
			//System.out.println(x + " " +nxtt[x]);
		}
		System.out.println("please review output and\nenter the correct key value: ");
		k = Main.key.nextInt(); //inputs k value to be encrypted
		nxtt = Shift(nxt,(k*-1));
		System.out.print("key is: " + k + "\nDecrypted text is: ");
		System.out.println(nxtt);
		System.out.print("Incrypted text is: ");
		System.out.println(nxt);
	}
}
