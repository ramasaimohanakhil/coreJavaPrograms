import java.util.Scanner;
public class StringPalindrome
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("enter a string");
String s1=scan.next();
System.out.println(s1);
boolean flag=true;
int i=0,j=s1.length()-1;
for(i=0;i<s1.length();i++)
{
if(s1.charAt(i)!=s1.charAt(j))
flag=false;
i++;j--;
}
if(flag==false)
System.out.println(s1+" is not a palindrome");
else System.out.println(s1+" is a palindrome");
}
}
