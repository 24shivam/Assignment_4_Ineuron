import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hisvam";
		String s2="shivam";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) 
		{
			System.out.println("IT IS A ANAGRAM");
			
		}
		else 
		{
			System.out.println("IT IS NOT ANAGRAM");
		}
		
	}
	

}
