import java.util.Scanner;
public class StrongNumber
{
public static int factorial(int n)
{int fact=1;
while(n>0)
{
fact=fact*n;
n--;
}
return fact;
}
public static boolean checkStrong(int n)
{int sum=0,temp=n;
while(n>0)
{
int digit=n%10;
int res=factorial(digit);
sum=sum+res;
n/=10;
}
if(sum==temp)
return true;
else
return false;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter a no");
int n=scan.nextInt();
boolean result=checkStrong(n);
if(result)
System.out.println(n+" is a strong no");
else
System.out.println(n+" is not a strong no");
}
}
