//check whether a no is armstrong no of order n
import java.util.Scanner;
public class ArmstrongNumberOfN
{
public static int power(int digit,int n)
{int result=1;
while(n>0)
{
result=result*digit;
n--;
}
return result;
}
public static boolean checkArmstrongNumber(int number,int n)
{
int sum=0;int temp=number,digit;
while(number>0)
{
digit=number%10;
sum=sum+power(digit,n);
number=number/10;
}
System.out.println("sum is "+sum);
if(sum==temp)
return true;
else
return false;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter order of armstrong");
int n=scan.nextInt();
System.out.println("enter no to check");
int number=scan.nextInt();
boolean result=checkArmstrongNumber(number,n);
if(result)
System.out.println(number+" is an armstrong no");
else
System.out.println(number+" is not an armstrong no");
}
}
