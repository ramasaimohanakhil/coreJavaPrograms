import java.util.Scanner;
public class NumberPalindrome
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int rev=0;
int temp=n;
while(n>0)
{
int digit=n%10;
rev=rev*10+digit;
n=n/10;
}
if(rev==temp)
System.out.println(rev+"is a palindrome");
else
System.out.println(temp+"is not a palindrome");

}
}
