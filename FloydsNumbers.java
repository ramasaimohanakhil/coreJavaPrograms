import java.util.Scanner;
public class FloydsTriangle
{
public static void printFloyd(int n)
{
for(int i=0;i<n;i++)
{
for(int j=1;j<=i;j++)
System.out.print(j+" ");
}

}
public static void main(String args[])
{
System.out.println("enter no of lines");
int lines=scan.nextInt();
printFloyd(lines);
}
}
