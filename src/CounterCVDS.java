
public class CounterCVDS {

	public static void main(String[] args) {
		String str="this is you @ # ";
		int consonants=0;
		int vowel=0;
		int specialCharater=0;
		str= str.toLowerCase();
		for(int i=0;i<str.length();i++) 
		{
			if((str.charAt(i)=='a') || (str.charAt(i)=='i') ||
			 (str.charAt(i)=='o') || (str.charAt(i)=='e')||(str.charAt(i)=='u') ) 
			{
				vowel++;
				
			}
			else if((str.charAt(i)>='a') && (str.charAt(i)<='z') )
			{
				consonants++;
				
			}
			else {
				specialCharater++;
			}
		}
		System.out.println("vowel: "+ vowel);
		System.out.println("consonants :"+ consonants);
		System.out.println("specialCharater:  "+ specialCharater);
		
		
		
		
//OUTPUT====>   vowel: 4
//		====>	consonants :5
//		====>	specialCharater:  7

	}

}
