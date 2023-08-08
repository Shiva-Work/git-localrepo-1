package amstronge;

public class Amstronge {

/*	public static void main(String[] args) {
		int i=407;
		int n=i;
		int sum=0;  	
		while(i>0)
		{
			int j=i%10;
			sum=sum+(j*j*j);
			i=i/10;
		}
		if(sum==n)
			System.out.println(n+" is armstrong");
		else
			System.out.println(n+" Not is armstrong");

	}*/
	
	public static void main(String args[])
	{
	int i=370,j=i,sum=0;
	while(i>0)
	{
	int h=i%10;
	sum=sum+(h*h*h);
	i=i/10;
	}
	if(sum==j)
	System.out.println(j+"is Armstrong");
	else
	System.out.println(j+"Not");

	
	String nj=String.valueOf(475);
	String bh=Integer.toString(788);
	int jk=Integer.parseInt(bh);
	int jh=Integer.valueOf(nj);
	char as=nj.charAt(0);
	String hj=String.valueOf('k');
	System.out.println(hj);
	}
}
