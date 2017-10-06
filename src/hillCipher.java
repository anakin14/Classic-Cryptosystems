import java.lang.reflect.Array;

/*
 * hillCipher class
 * solves hillCiphers
 */
public class hillCipher {

	public static int[] matrixInverse(int a, int b, int c, int d)//abcd are the int values(0-25) of the matrix 
	{
		int[] array = new int[4];
		int n = 26;//based on the 26 letter alphabet, can be modified to support different length alphabets
		int det = a*c-d*b;
		a = d;
		d = a;
		b = b*-1;
		c = c*-1;
		det = determinant(det);
		if(det == -1)
		{
			System.out.print("Not invertible");
			array[1] = -1;
			return array;
		}
		else
			a = (a*det) % n;
			b = (b*det) % n;
			c = (c*det) % n;
			d = (d*det) % n;
			array[1] = a;
			array[2] = b;
			array[3] = c;
			array[4] = d;
			
	return array;	
			
		
		
		
	}

	private static int determinant(int det) {
		if(det == 1)
		return 0;
		return -1;
	}
}
