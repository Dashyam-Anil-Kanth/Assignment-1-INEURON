
public class Forth {

	public static void main(String[] args) {
		int i,j;
		int n=15;
		
		for(i=1;i<n;i++)
		{						
			for (j=1;j<n;j++)
			{
				if( ((j==1 || j==n-1) && (i>6))  || i==n-1 || i==n-2 ||
					(i==8 && (j<3 || j>n-3)) ||
					(i==9 && (j<4 || j>n-4)) ||
					(i==10 && (j<5 || j>n-5)) ||
					(i==11 && (j<6 || j>n-6)) ||
					(i==12 && (j<7 || j>n-7)) )
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
