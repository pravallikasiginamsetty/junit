package singleton.Remove;

public class Remove 
{

	public String check(String s)
	{
		int n=s.length();
		String s1="";
		  if(n==0)
			  return s1;
		  
		  if(n==1)
		   {
			   if(s.charAt(0)!='a') 
				   s1=s1+s.charAt(0);
			   else
				   s1=s1+s.charAt(0);
		   }
	  
		   
		   else
		   {
			   if(s.charAt(0)=='a'&&s.charAt(1)=='a')
				  s1="";  
			   else if(s.charAt(0)=='a')
				   s1=s1+s.charAt(1);
			   else if(s.charAt(1)=='a')
				   s1=s1+s.charAt(0);
			   else
				    //s1=s1+s.charAt(0)+s.charAt(1);
			   s1=s1+s.substring(2,n);
		   }
		return s1; 
	}
}  
			   
		  