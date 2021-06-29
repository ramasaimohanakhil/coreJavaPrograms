import java.util.Scanner;
public class AutomorphicNumber
{
public static boolean checkAuto(int n)
{
int t1=n,t2=n;
n*=n;
System.out.println(n);
while(t1>0)
{
if(n%10!=t1%10)

return false;

n/=10;t1/=10;
}
return true;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter no to check automorphic");
int n=scan.nextInt();
boolean res=checkAuto(n);
if(res)
System.out.println(n+" is an automorphic no");
else
System.out.println(n+" is not an automorphic no");
}
}
