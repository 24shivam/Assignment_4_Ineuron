
public class checkUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "somethingh";
		String ans="";
		st=st.toLowerCase();
		Boolean flag=false;
		for (int i = 0; i < st.length(); i++) 
		{
            for (int j = i + 1; j < st.length(); j++) 
            {
                if (st.charAt(i) == st.charAt(j)) 
                {
                	flag=true;
                }
            }
            
            
		}
		System.out.println("the given string are "+ st);
		if(flag ==false )
		{
			System.out.println("this string  contain Unique character");
		}
		else {
			System.out.println("this string  not contain Unique character");
		}

	}

}
