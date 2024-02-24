class perfectSquare
{
public static void main(String[] args)
{
int n=35;
int count=0;
for(int i=1;i<=n;i++)
{
if(i*i==n)
{
count=1;
break;
}
}
if(count==1)
{
System.out.println(n+"is a perfect square");
}
else
{
System.out.println(n+"is a not perfect square");
}
}
}
