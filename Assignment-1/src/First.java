
public class First {

	public static void main(String[] args) {
		System.out.println(" ");
		int i,j;
		int n=10;
		for (i=1;i<n;i++) 
		{
			for (j=1;j<n;j++)
			{
				if( j==n/2  ||
					i==1 	||
					i==n-1 	)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			for (j=1;j<n;j++)
			{
				if( j==1   ||		  		 									
					j==n-1 ||
					i==j   )							 				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
			for (j=1;j<n;j++)
			{
				if( i==1	||
					i==n/2	||
					i==n-1	||
					j==1	)						
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			for (j=1;j<n;j++)
			{
				if( i==n-1 && j>1 && j<n-1 ||
					j==1 && i<n-1 		   ||
					j==n-1 && i<n-1        )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
			for (j=1;j<n;j++)
			{
				if( j==1 					||
					i==1 && j<n-1 			||
					j==n-1 && i>1 && i<n/2  ||
					i==n/2 && j<n-1 		||
					i-j==1 && (i>=n/2 && (i>3 && j<n-1)) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
			for (j=1;j<n;j++)
			{
				if( i==1 && j>1 && j<n-1   ||
					i==n-1 && j>1 && j<n-1 ||
					j==1 && i>1 && i<n-1   ||
					j==n-1 && i>1 && i<n-1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
			for (j=1;j<n;j++)
			{
				if( j==1   ||		  		 									
					j==n-1 ||
					i==j   )							 				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");	
			System.out.println(" ");
			
		}

	}

}
