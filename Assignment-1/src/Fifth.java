
public class Fifth {

	public static void main(String[] args) {
		int i,j;
		int n=15;
		
		for(i=1;i<n;i++)
		{						
			for (j=1;j<n;j++)
			{
				if( i==1 || i==n-1 || j==1  ||
					(j==2 && (i<7 || i>7))  || 
					(j==3 && (i<6 || i>8))  ||
					(j==4 && (i<5 || i>9))  ||
					(j==5 && (i<4 || i>10)) ||
					(j==6 && (i<3 || i>11)) ||
					j==7 && i==n-2			)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println(" ");
		}

	}

}
