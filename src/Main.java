import java.util.Scanner;
public class Main {	
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		ShiftCipher.Menu(key);
		String sentence="";
		int x;
		sentence = key.nextLine();
		x = key.nextInt();
			sentence = sentence + key.next();
			System.out.println(sentence);
			
			
		System.out.println(sentence);
		System.out.println("end" + x);
		//Convert.CharCount(input.toCharArray(),true);	
		System.out.println("example3");
		key.close();
	}
}
