
public class AtoZ {

	public static void main(String[] args) {
		System.out.println(" ");
		int i,j;
		int n=10;
		for (i=1;i<n;i++) 
		{			
/*A*/   	for (j=1;j<n;j++)
			{
				if( i==1 && (j>1 && j<n-1)  ||
					i==n/2  				||
					j==1 && i>1				||
					j==n-1 && i>1			)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");			
			
						
/*B*/	    for (j=1;j<n;j++)
			{
				if(  j==1 										 ||
					 j==n-1 && ((i>1 && i<n/2)|| (i>1 && i<n-1)) ||
					 (i==1 || i==n/2 || i==n-1) && j<n-1		 )					
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
/*C*/	    for (j=1;j<n;j++)
			{
				if( j==1  && (i>1 && i<n-1)	||
					i==1  && j>1 			||
					i==n-1 && j>1			)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
/*D*/		for (j=1;j<n;j++)
			{
				if( j==1 					 ||
					i==1 && j<n-1			 ||
					i==n-1 && j<n-1			 ||
					j==n-1 && (i>1 && i<n-1) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
/*E*/       for (j=1;j<n;j++)
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
			
/*F*/       for (j=1;j<n;j++)
			{
				if( j==1						||
					i==1						||
					i==n/2 && j<((3*(n-1))/2)	)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			} System.out.print("   ");
			
/*G*/       for (j=1;j<n;j++)
			{
				if(  j==1  && (i>1 && i<n-1)					||
					(i==n-1 || i==1)  && (j>1 && j<=(3*n)/4)	||
					 i==n/2 && j>n/2							||
					 j==n-1 && i>n/2							)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
/*H*/       for (j=1;j<n;j++)
			{
				if( i==n/2  ||
					j==1 	||
					j==n-1 	)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
/*I*/		for (j=1;j<n;j++)
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
			
/*J*/ 	    for (j=1;j<n;j++)
			{
				if( i==n-1 && j<n/2  ||
					i==1 			 ||
					j==n/2 && i<n-1  )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
/*K*/	    for (j=1;j<n;j++)
			{
				if( j==1		  ||
					i-j==(n-1)/3  ||
				    i+j==n-3      )
				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*L*/	    for (j=1;j<n;j++)
			{
				if( j==1		  ||
					i==n-1        )
				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   "); 
			
/*M*/ 	    for (j=1;j<n;j++)
			{
				if( j==1		  		 										 ||
					j==n-1 		 						 ||
					i==j && ((j<(n+2)/2 )||(i<(n+2)/2 )) ||
					i+j==n && i<n/2						 )				
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*N*/		for (j=1;j<n;j++)
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
			
/*O*/		for (j=1;j<n;j++)
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
			
/*P*/       for (j=1;j<n;j++)
			{
				if( j==1 					||
					i==1 && j<n-1 			||
					j==n-1 && i>1 && i<n/2  ||
					i==n/2 && j<n-1			)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*Q*/ 		for (j=1;j<n;j++)
			{
				if( i==1 && j>1 && j<n/2   ||
					i==n-1 && j>1 && j<n/2 ||
					j==1 && i>1 && i<n-1   ||
					j==n/2 && i>1 && i<n-1 ||
					i-j==2 && i>=n/2		)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*R*/		for (j=1;j<n;j++)
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
			
/*S*/		for (j=1;j<n;j++)
			{
				if( i==1 &&  j>1     		 ||
					i==n/2 && j<n-1 && j>1   ||
					i==n-1 && j<n-1  	     ||
					j==1 && i<n/2 && i>1     ||
					j==n-1 && i>n/2 && i<n-1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*T*/		for (j=1;j<n;j++)
			{
				if( i==1          ||
					j==n/2 && i>1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*U*/		for (j=1;j<n;j++)
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
			
/*v*/		for (j=1;j<n;j++)
			{
				if( j==1 && i<=n/2 			    ||
					j==n-1 && i<n/2			    ||
					i-j==4 && i>=n/2 && j<=n/2  ||
					i+j==14 && i>=n/2 && j>=n/2 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*W*/		for (j=1;j<n;j++)
			{
				if( j==1							 ||
					j==n-1							 ||
					i+j==11 && i>=n/2 && j>1 && j<=5 ||
					i-j==1 && i>=n/2 && j>=n/2 && j<n-1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*X*/		for (j=1;j<n;j++)
			{
				if( i==j || i+j==10)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*Y*/		for (j=1;j<n;j++)
			{
				if( i==j && i<=n/2 			   ||
					i+j==10 && i<n/2 && j>=n/2 ||
					j==n/2 && i>n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}System.out.print("   ");
			
/*Z*/		for (j=1;j<n;j++)
			{
				if( i==1    ||
					i==n-1 	||
					i+j==10 )
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
