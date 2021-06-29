import java.util.Scanner;
public class AutomorphicNumbersBelowN
{
public static boolean checkAuto(int n)
{
int t1=n,t2=n;
n*=n;
while(t1>0)
{
if(t1%10!=n%10)
return false;
t1/=10;n/=10;
}
return true;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter to check for automorphic nos");
int n=scan.nextInt();
System.out.println("automorphic nos below"+n+" are");
for(int i=1;i<=n;i++)
{
boolean res=checkAuto(i);
if(res)
System.out.println(i);

}
}
}
