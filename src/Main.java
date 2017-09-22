import java.util.Scanner;
public class Main {
	public static Scanner key = new Scanner(System.in);
	
	
	public static void main(String[] args)
	{
		ShiftCipher.Menu();
		String sentence="";
		int x;
		sentence = key.nextLine();
		x = key.nextInt();
			sentence = sentence + key.next();
			System.out.println(sentence);
			
			
		System.out.println(sentence);
		System.out.println("end" + x);
		//Convert.CharCount(input.toCharArray(),true);	
		System.out.println("example2");
	}
}
