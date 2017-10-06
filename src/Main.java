import java.util.Scanner;
public class Main {	
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
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
