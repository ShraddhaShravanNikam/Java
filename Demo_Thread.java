import java.io.*;
import java.util.*;
class A extends Thread
{
   public void run()
{
  for(int i=1;i<=10;i++)
{
  System.out.println(+i);
}
}
}
class B extends Thread
{
   public void run()
{
  for(int i=10;i>=1;i--)
{
  System.out.println(+i);
}
}
}
public class Demo_Thread
{
  public static void main(String arg[])
{
  A a1=new A();
  B b1=new B();
  a1.start();
  b1.start();
}
}


