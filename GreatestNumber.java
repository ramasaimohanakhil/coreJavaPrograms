import java.util.Scanner;
public class GreatestNumber
{
public static void main(String args[])
{
System.out.println("enter no of ele");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
 a[i]=scan.nextInt();
}
int max=a[0];
for(int i=0;i<n;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.println("max ele is"+max);
}
}
