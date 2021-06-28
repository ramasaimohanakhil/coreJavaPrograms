import java.util.Scanner;
public class PascalTriangle
{
public static int factorial(int n)
{
int fact=1;
while(n>0){
fact=fact*n;
n=n-1;}
return fact;
}
public static int binomialCoefficient(int line,int j)
{
int res=1;
res=(factorial(line))/(factorial(line-j)*factorial(j));
return res;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter no of lines");
int totalLines=scan.nextInt();
for(int line=0;line<totalLines;line++)
{
for(int j=0;j<=line;j++)
{
System.out.print(binomialCoefficient(line,j)+" ");
}
System.out.println();
}
}
}
