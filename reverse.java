class reverse
{
public static void main(String[] args)
{
int n=345;
int rev=0;
int ld=0;
while(n>0)
{
ld=n%10;
rev=(rev*10)+ld;
n=n/10;
}
System.out.println("reverse number is:" +rev);
}
}
