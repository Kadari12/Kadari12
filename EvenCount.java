class EvenCount
{
public static void main(String[] args)
{
int n=45324;
int getlastdigit=0;
int count=0;
while(n>0)
{
getlastdigit=n%10;
if(getlastdigit%2==0)
{
count++;
}
n=n/10;
}
System.out.println(count);
}
}
