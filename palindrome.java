class palindrome
{
public static void main(String[] args)
{
int n=121;
int temp=n;
int rev=0;
int ld=0;
while(n>0)
{
ld=n%10;
rev=(rev*10)+ld;
n=n/10;
}
if(rev==temp)
{
System.out.println("given number is palindrome");
}
else
{
System.out.println("given number is not palindrome");
}
}
}
