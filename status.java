class status
{
public static void main(String[] args)
{
int sum=0;
for(int a=1;a<=1000;a++)
{
for(int i=1;i<=a/2;i++)
{
if(i*i==a)
{
if(a%2==0)
{
System.out.println(a);
}
}
}
}
}
}
