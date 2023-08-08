package palindrome;

public class Palindrome {

	
		
		
	/*	int i=25452;
		int reverse=0,j=i;
		while(i>0)
		{
			int d=i%10;
			reverse=(reverse*10)+d;
			i=i/10;
		}
		if(reverse==j)
			System.out.println(j+" is Palindrome No.");
		else
			System.out.println(j+" is Not Palindrome No."); */
		/*
		String st1="madam",st2="";
		
		int k=st1.length();
		
		for(int j=k-1;j>=0;j--)
		{
			st2=st2+st1.charAt(j);
		}
		//if(st2==st1)
		if(st2.equals(st1))
		{
			System.out.println(st1+" is palindrome");
		}
		else
		{
			System.out.println(st1+" is Not palindrome");
		}
		
		*/
		
		public static void main(String args[])
		{

		int i=123454321,j=i,rev=0;

		while(i>0)
		{
		int k=i%10;
		rev=(rev*10)+k;
		i=i/10;
		}
		if(rev==j)
		{
		System.out.println(j+"is palindrome");
		}
		else
		{
		System.out.println(j+" Not");
		}
		}
			
		
	

}
