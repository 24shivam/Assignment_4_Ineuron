
public class Pangram {

	public static void main(String[] args) {
		boolean flag=false;
		
		String s1="The five boxing wizards jump quickly";
		s1=s1.toUpperCase();
		s1=s1.replace(" ","");
		
		char[] ch= s1.toCharArray();
		
		int []ar=new int [26];
		
		for(int i=0;i<ch.length;i++) {
			int index=ch[i]-65;
			ar[index]++;
		}
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("IT IS NOT PANGRAM");
				flag=true;
				
			}
		}
		if(flag==false) {
			System.out.println("IT IS A PANGRAM");
		}
		

	}

}
