import java.util.Scanner;
public class FloydsTriangle
{
public static void printFloyd(int n)
{int number=1;
for(int i=0;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(number+" ");
number++;
}
System.out.println();
}

}
public static void main(String args[])
{
System.out.println("enter no of lines");
Scanner scan=new Scanner(System.in);
int lines=scan.nextInt();
printFloyd(lines);
}
}
