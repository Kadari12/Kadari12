class perfectnumber
{
public static void main(String[] args)
{
int sum=0;
int n=6;
for(int i=1;i<=6;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(n==sum)
{
System.out.println("it is a perfect number");
}
else
{
System.out.println("it is not a perfect number");
}
}
}
