class even
{
public static void main(String[] args)
{
int n=45324;
int getlastdigit=0;
while(n>0)
{
getlastdigit=n%10;
if(getlastdigit%2==0)
{
System.out.println(getlastdigit);
}
n=n/10;
}
}
}
