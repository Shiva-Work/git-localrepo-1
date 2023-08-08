package reverse;

public class Reverse {

	/*public static void main(String[] args) {
		
		String st1="hello world",st2="";
		
		int k=st1.length();
		for(int a=k-1;a>=0;a--)
		{
			st2=st2+st1.charAt(a);
		}

		System.out.println(st2);
		
		int n=2341,sum=0;
		while(n>0)
		{
			int h=n%10;
			sum=(sum*10)+h;
			n=n/10;
		}
		System.out.println(sum);
	}*/
	
	public static void main(String[] args)
	{

	String st1="hello";
	int length=st1.length();
	String st2="";
	for(int i=length-1;i>=0;i--)
	{
	st2=st2+st1.charAt(i);
	}
	System.out.println(st2);

	int i=1234;
	int sum=0;
	while(i>0)
	{
	int k=i%10;
	sum=(sum*10)+k;
	i=i/10;
	}
	System.out.println(sum);
	}

}
