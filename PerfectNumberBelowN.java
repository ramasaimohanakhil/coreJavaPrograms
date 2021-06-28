import java.util.Scanner;
public class PerfectNumberBelowN
{
public static int checkPerfectNumber(int n)
{
int sum=1;
for(int i=2;i*i<=n;i++)
{
if(n%i==0)
{
if(i*i!=n)
sum=sum+i+n/i;
else
sum=sum+i;
}
}
if(sum==n&&n!=1)
return sum;

return 0;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter upperlimit to print perfect nos");
int n=scan.nextInt();
System.out.println("perfect nos below "+n+" are");
for(int i=1;i<=n;i++)
{

int result=checkPerfectNumber(i);
if(result!=0)
{

System.out.println(result);
}
}
}
}
