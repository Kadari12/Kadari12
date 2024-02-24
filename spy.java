class spy
{
public static void main(String[] args)
{
int n=22;
int sum=0;
int product=1;
int getLastDigit=0;
while(n>0)
{
getLastDigit=n%10;
sum=sum+getLastDigit;
product=product*getLastDigit;
n=n/10;
}
if(sum==product)
{
System.out.println("spy program");
}
else
{
System.out.println("not spy program");
}
}
}
