import java.util.Scanner;
public class NeonNumber
{
public static boolean checkNeon(int n)
{int sum=0,temp=n;
n=n*n;
while(n>0)
{
int digit=n%10;
sum=sum+digit;
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
System.out.println("enter no to check");
int n=scan.nextInt();
boolean res=checkNeon(n);
if(res)
System.out.println(n+" is a neon no");
else
System.out.println(n+" is not a neon no");
}
}
