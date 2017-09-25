
public class Matrix {
	public int[][] inverse(int m, int n)
	{
		
		int x,y;
		int[][] xy=new int[m][n];
		
		for (x=0;x<m;x++)
			for (y=0;y<n;y++)
				if (x==0&&y==0)
					xy[x][y]=1;
				else if ((x+y)%2==0)
					xy[x][y]=1;
				else if ((x+y)%2==1)
					xy[x][y]=-1;
		
		
		for (x=0;x<m;x++)
		{
			for (y=0;y<n;y++)
				System.out.printf("%3s" ,xy[x][y]);
			System.out.print("\n");
		}
		return(xy);
				
					
					
	}
}
