class prime
{
public static void main(String[] args)
{
int count=0;
int n=10;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("it is a prime number");
}
else
{
System.out.println("it is not a prime number");
}
}
}
