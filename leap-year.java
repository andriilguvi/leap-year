import java.io.*;
import java.util.*;
class leap_year
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
if(a%4==0)
{
if(a%100==0)
{
if(a%40==0)
{
System.out.print(a+" "+"leap year");
}
}
}
else
System.out.print(a+" "+"not a leap year");
}
}
