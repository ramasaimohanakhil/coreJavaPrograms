import java.util.Scanner;
public class Swap2NosWithoutThirdVariable
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter 2 nos");
int a=scan.nextInt();
int b=scan.nextInt();
System.out.println("2 nos are a= "+a+"b= "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("2 nos are a="+a+"b= "+b);
}
}
