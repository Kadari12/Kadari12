class  Program2
{
	public static void main(String[] args) 
	{
		add();
		Program2 res=new Program2();
		res.sub();
		res.mul();
		}
	public static void add()
	{
		int a=1;
		int b=4;
		System.out.println(a+b);
	}
	public void sub()
	{
		int a=9;
		int b=4;
		System.out.println(a-b);
	}
	public void mul()
	{
		int a=5;
		int b=5;
		System.out.println(a*b);
	}

}
