class Program5 
{
	public static void spy(int m,int n)
	{
		for(int i=m;i<=n;i++)
		{
			int temp=i;
			int sum=0;
			int product=1;
			while(temp!=0)
			{
				int ld=temp%10;
				sum=sum+ld;
				product=product*ld;
				temp=temp/10;
			}
		if(sum==product)
			{
			System.out.println(i);
			}
		}
	}
		public static void main(String[] args) 
	    {
		spy(10,1000);
	     }
}
