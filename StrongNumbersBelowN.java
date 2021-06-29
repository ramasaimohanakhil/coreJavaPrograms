import java.util.Scanner;
public class StrongNumbersBelowN
{
public static int factorial(int n)
{int fact=1;
while(n>0)
{fact=fact*n;
n--;
}
return fact;
}
public static boolean checkStrong(int n)
{int sum=0,temp=n;
while(n>0)
{
int digit=n%10;
sum=sum+factorial(digit);
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
System.out.println("strong nos below"+upperLimit);

for(int i=1;i<=upperLimit;i++)
{
boolean result=checkStrong(i);
if(result)
System.out.println(i);

}
}
}
