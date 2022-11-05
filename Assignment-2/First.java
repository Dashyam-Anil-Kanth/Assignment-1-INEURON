import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		//finding duplicates present in an array
		
		int arr[]= {1,3,4,3,5,6,1,7,4,7,7};
		Scanner ip=new Scanner(System.in);
		
		System.out.println("please enter the value");
		int a=ip.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				System.out.println("value is repeated at "+ i );
			}					
		}		
	}
}
