package prime;


public class Prime {

	/* public static void main(String[] args) {
		
		int i=13,j=0;
		
		if(i>=2)
		{
			for(int k=1;k<=i;k++)
			{
				if(i%k==0)
				{
					j++;
				}
			}
		
		 if(j==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
		}
		else
		{
			System.out.println("Not Prime number");
		}
		
		
		

	} */
	
	public static void main(String[]args)
	{

	int i=11,count=0;

	if(i>=2)
	{
	for(int j=1;j<=i;j++)
	{
	if(i%j==0)
	{
	count++;
	}

	}
	if(count==2)
	{
	System.out.println(i+" prime");
	}
	else
	{
	System.out.println(i+" prime");
	}
	}
	else
	System.out.println(i+" Not prime"); 

// first change in cloning process
		// second process for local pull request 
           
//after pulling added

	}

}
