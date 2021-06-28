import java.util.Scanner;
public class ArmstrongNumberBelowN
{
public static int power(int digit,int n)
{
int result=1;
while(n>0)
{
result=result*digit;
n--;
}
return result;
}
public static int printArmstrongNumbers(int n,int order)
{
int digit=0,sum=0;int temp=n;
while(n>0)
{
digit=n%10;
sum=sum+power(digit,order);
n/=10;
}
if(sum==temp)
return sum;
else 
return 0;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter order of the armstrong no");
int order=scan.nextInt();int result=0;
System.out.println("enter upperlimit");
int upperLimit=scan.nextInt();
for(int i=1;i<=upperLimit;i++)
{
result=printArmstrongNumbers(i,order);
if(result!=0)
System.out.println(result);
}
}
}
