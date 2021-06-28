import java.util.Scanner;
public class PalindromeSecondApproach
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String rev="",str1;
System.out.println("enter new string");
str1=scan.next();
for(int i=str1.length()-1;i>=0;i--)
{
rev=rev+str1.charAt(i);
}
if(str1.equals(rev))
System.out.println(str1+" is a palindrome");
else 
System.out.println(str1+" is not a palindrome");
}
}
