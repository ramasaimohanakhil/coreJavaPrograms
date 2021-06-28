import java.util.Scanner;
public class Factorial
{
public static void main(String args[])
{
System.out.println("enter new number");
Scanner scan=new Scanner(System.in);
long fact=1;
int n=scan.nextInt();
while(n>0)
{
fact=fact*(n);
System.out.println(fact);
n=n-1;
}
System.out.println("factorial is"+fact);
}}
