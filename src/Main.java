import java.util.Scanner;
public class Main {
	public Scanner key = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		ShiftCipher.Menu();
		String sentence="";
		int x;
		Scanner key = new Scanner(System.in);
		sentence = key.nextLine();
		x = key.nextInt();
		key.close();
		Scanner key1 = new Scanner(System.in);
			sentence = sentence + key1.next();
			System.out.println(sentence);
			
			
		System.out.println(sentence);
		System.out.println("end" + x);
		key.close();
		Convert.CharCount(input.toCharArray(),true);	
		key.close();
	}
}
