package javaPractice;

class ReverseString
{
	
public static void main(String[] args) 
{


//status
	
	String ss="ayda";
	
	String rev="";
	
	int ll=ss.length();
	
	for(int i=ll-1;i>=0;i--)
	{
		
		rev=rev+ss.charAt(i);
		
	}
	
	System.out.println(rev);
}






}