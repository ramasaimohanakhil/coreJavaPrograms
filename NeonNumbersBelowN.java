import java.util.Scanner;
public class NeonNumbersBelowN
{
public static boolean checkNeon(int n)
{int temp=n;
n=n*n;
int sum=0;
while(n>0)
{
int digit=n%10;
sum=sum+digit;
n/=10;
}
if(temp==sum)
return true;
else
return false;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter upperlimit");
int upperLimit=scan.nextInt();
for(int i=1;i<=upperLimit;i++)
{
boolean res=checkNeon(i);
if(res)
System.out.println(i);
}
}
}
