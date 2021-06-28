import java.util.Scanner;
public class PascalTriangleThirdApproach
{
public static void printPascal(int lines)
{
int value=1;
for(int i=1;i<=lines;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(value+" ");
value=value*(i-j+1)/j;
}
System.out.println("1");
System.out.println();

}
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter no of lines ");
int n=scan.nextInt();
printPascal(n);
}
}
