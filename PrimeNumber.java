import java.util.Scanner;
public class PrimeNumber
{
public static void main(String args[])
{boolean flag=true;
System.out.println("enter new no");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=2;
while(i<=n/2)
{
if(n%i==0)
{
flag=false;
}
i++;
}
if(flag==false)System.out.println("no "+n+" is composite");
else System.out.println("no "+n+" is prime");
}}
