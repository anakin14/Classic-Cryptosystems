import java.util.Scanner;
import java.util.ArrayList;
public class Counter {
	public static int[] CharCount (char[] nxt,boolean print)
	{	
		int y=nxt.length, x, z;
		int[] values = new int[26];
		for(x=0; x < y; x++)
		{
			for(z=0; z < 26; z++)
			{
				if (nxt[x] == Convert.alpu[z])
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
				System.out.print(Convert.alpu[x]+"="+values[x]+"  ");
			}
		return(values);
	}
	public static int[] IntCount (Scanner key, boolean print)
	{
		int x,y;
		char[] num = {'0','1','2','3','4','5','6','7','8','9','*','+','-','!','?',';',':','.','`','[',']','"'};
		int[] values = new int[24];
		String sentence;
		sentence = "53++!305))6*;4826)4+.)4+);806*;48!8`60))85;]8*:+*8!83(88)5*!;46(;88*96*?;8)*+(;485);5*!2:*+(;4956*2(5*-4)8`8*; 4069285);)6!8)4++;1(+9;48081;8:8+1;48!85;4)485!528806*81(+9;48;(88;4(+?34;48)4+;161;:188;+?;";
		char in[] = sentence.toCharArray();
		for (x=0;x<in.length;x++)
		{
			for (y=0;y<num.length;y++)
			{
				if (in[x] == num[y])
				values[y]++;
			}
		}
		if (print)
		{
			System.out.print("Instance Counts:\n-----------------\n");
			for (x=0;x<num.length;x++)
			{
				System.out.printf("'%s': %2s  ", num[x] , values[x]);
				if (x%5==4)
					System.out.print("\n");
			}
			System.out.print("\n\nFrequincy Table\n-----------------\n");
			for (x=0;x<num.length;x++)
			{
				System.out.printf("'%s': %7.6s"
						+ "  " , num[x] , (double)values[x]/in.length);
				if (x%5==4)
					System.out.print("\n");
			}
		}
		return(values);		
	}
	public static String[] SymbolCounter (String input)
	{
		ArrayList<int> values = new ArrayList();
		return()
	}
}
