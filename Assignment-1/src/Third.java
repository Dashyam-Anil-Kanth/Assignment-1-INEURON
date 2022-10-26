
public class Third {

	public static void main(String[] args) {
		int i,j;
		int n=15;
		 
		for (i=1;i<n;i++)
		{
			for (j=1;j<n;j++)
			{
				if(i==1 || j==1 || i==n-1 || j==n-1 ||
				   i==2 &&  (j>7 || j<7) ||
				   i==3 &&  (j>8 || j<6) ||
				   i==4 &&  (j>9 || j<5) ||
				   i==5 &&  (j>10 || j<4)||
				   i==6 &&  (j>11 || j<3) 
					)
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
