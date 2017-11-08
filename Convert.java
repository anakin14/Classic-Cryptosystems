import java.util.Scanner;

public class Convert {
	private static char[] alpl =("abcdefghijklmnopqrstuvwxyz").toCharArray();
	public static char[] alpu =("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
	public static char[] IntChar (int[] values)//converts char array into int array
	{										   //based on alphabetical value a=0 b=1....ext
		int y= values.length, x;
		char[] nxt = new char[y];
		for (x = 0; x < y; x++)
			if (values[x]>=0)
			nxt[x] = alpl[values[x]];
		return (nxt);
	}
	public static int[] CharInt (char[] nxt)//converts char array into int array based 
	{										//on alphabetical value(special char = -1)
		int x,z,y=nxt.length;
		int values[] = new int[y];
		for (x=0; x < y ; x++ )
		{
			for (z=0; z<=25; z++ )
			{
				if (nxt[x] == alpl[z] || nxt[x] == alpu[z])
					values[x]=z;				
			}				
		}
		return (values);
	}
	public static String InputString(Scanner key)
	{
		String word,sentence="",ptext;
		System.out.print("please insert text: ");
		key.nextLine();
		ptext = key.nextLine();
		Scanner words = new Scanner(ptext);	//creates scanner for string		
		while (words.hasNext())
		{
			word = words.next();
			sentence = sentence + word;
		}
		words.close();
		return(sentence);
	}
}
