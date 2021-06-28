import java.util.Scanner;
public class FibonacciSeries
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter no of ele in fibonacci series min 2");
int n=scan.nextInt();
int a[]=new int[n];
a[0]=0;a[1]=1;
n=n-1;int i=2;
while(i<=n)
{
a[i]=a[i-1]+a[i-2];
i++;
}
for(i=0;i<=n;i++)
{
System.out.println(a[i]);
}

}
}
