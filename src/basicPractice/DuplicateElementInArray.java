package basicPractice;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class DuplicateElementInArray 
{

	
	@Test
	public void duplicateArray()
	{
		
		String name[]= {"pooja","daya","ram","shyam","ganesh","gopal","pooja","daya","gopal","DAYA"};
		
		Set<String> st=new HashSet<String>();
		
		for (String string : name) 
		{
		
			if(st.add(string)==false)
			{
				
				System.out.println(string);
				
			}
			
			
		}
		
		
		
		
	}
	
	
	
}
