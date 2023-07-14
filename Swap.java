import java.io.*;
import java.util.*;
class Swap
{
  public static void main(String arg[])
{
   int a,b,temp;
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
 System.out.println("Before swapping");
   System.out.println("Value of a nad b ="+a+" "+b);
  temp=a;
  a=b;
  b=temp;
 System.out.println("After swapping");
 System.out.println("Value of a nad b ="+a+" "+b);
}
}