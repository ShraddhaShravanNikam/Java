import java.io.*;
import java.util.*;
class SBI
{
   public void disp()
{
   System.out.println("Rate=60%");
}
}
class BOI extends SBI
{
   
   public void disp()
{
   System.out.println("Rate=30%");
}
}
class Bank
{
public static void main(String arg[])
{
  BOI b=new BOI();
  b.disp();
   
}
}