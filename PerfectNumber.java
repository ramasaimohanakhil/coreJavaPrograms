import java.util.Scanner;
public class PerfectNumber
{
public static void main(String args[])
{
System.out.println("enter new no");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();int sum=1;
for(int i=2;i*i<=n;i++)
{
if(n%i==0)
{System.out.println("divisors are "+i);
if(i*i!=n)
sum=sum+i+n/i;
else
sum=sum+i;
}
}
System.out.println("sum is"+sum);
if(sum==n&&n!=1)
System.out.println(n+" is a perfect number");
else
System.out.println(n+" is not a perfect number");
}
}
