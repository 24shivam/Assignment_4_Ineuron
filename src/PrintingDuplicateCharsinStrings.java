import java.util.Scanner;

public class PrintingDuplicateCharsinStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan =new Scanner(System.in);
//		System.out.println("PLEASE ENTER THE STRING");
//		String str=scan.nextLine();
		String str="Aappplee";
		String str1=str.toLowerCase();
		char[]arr=str1.toCharArray();
		System.out.println("The String are : " +str);
		System.out.print("Duplicates charaters are present :");
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) 
				{
					System.out.print(arr[j]+" ");
					break;
					
				}
			}
		}
		

	}
//OUTPUT:====>  The String are : Aappplee
//	            Duplicates charaters are present :a p p e 
}
