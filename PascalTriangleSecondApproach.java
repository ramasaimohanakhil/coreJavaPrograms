import java.util.Scanner;
public class PascalTriangleSecondApproach
{
public static void printPascal(int lines)
{
int a[][]=new int[lines][lines];
for(int i=0;i<lines;i++)
{
for(int j=0;j<=i;j++)
{
if(j==0||j==lines)
a[i][j]=1;
else
a[i][j]=a[i-1][j-1]+a[i-1][j];
System.out.print(a[i][j]);
}
System.out.println("");
}
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter no of lines for pascal Triangle");
int lines=scan.nextInt();
printPascal(lines);
}
}
