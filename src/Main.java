import java.util.Scanner;
public class Main {	
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		ShiftCipher.Menu(key);
		key.nextLine();
		Convert.CharCount(key.nextLine().toCharArray(),true);	
		System.out.println("example3");
		key.close();
	}
}
