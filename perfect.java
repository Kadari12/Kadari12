class perfect
{
public static void main(String[] args)
{
int n=28;
int sum=0;
for(int i=1;i<28;i++)
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
