//import java.util.Scanner;

public class Convert {
	private static char[] alpl =("abcdefghijklmnopqrstuvwxyz").toCharArray();
	private static char[] alpu =("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
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
	public static int[] CharCount (char[] nxt,boolean print)
	{
		
		int y=nxt.length, x, z;
		int[] values = new int[26];
		for(x=0; x < y; x++)
		{
			for(z=0; z < 26; z++)
			{
				if (nxt[x] == alpl[z])
				{
					values[z]++;
				}
			}
		}
		if (print)
			for (x=0; x<values.length;x++)
			{
				if (x%5==0)
					System.out.print("\n");
				System.out.print(alpu[x]+"="+values[x]+"  ");
			}
		return(values);
	}
	public static String InputString()
	{
		Scanner key1 = new Scanner(System.in);
		String word,sentence="",ptext;
		System.out.print("please insert text: ");
		ptext = key1.nextLine();
		key1.close();
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
