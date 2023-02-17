import java.util.Scanner;

public class removingDuplicates {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("PLEASE ENTER THE STRING");
		String str=scan.nextLine();
		String str1=str.toLowerCase();
		String ans="";
		
		char[]arr=str1.toCharArray();
		System.out.println("The String are : " +str);
		
		int i,j;
 
		for(i=0;i<arr.length;i++) 
		{
			
			for( j=0;j<i;j++)
			{
				if(arr[i]==arr[j]) 
				{

					break;
					
				}
			}
			if(j==i) {
				ans+=arr[i];
			}

		}
		System.out.println(ans);

		

	}
		
		

}


