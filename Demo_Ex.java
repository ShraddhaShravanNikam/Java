import java.io.*;
import java.util.*;
class Ex_Demo extends Exception
{
  Ex_Demo(String str)
{
   System.out.println(str);
}
}
class Demo_Ex 
{
  public static void main(String arg[])
{
   String str="India";
  try
{
  if(str.equals("india"))
{
   System.out.println("MAtch");
}
else
{
   throw new Ex_Demo("NotMatchException ");
}
}
catch(Ex_Demo e)
{
    System.out.println(e);
}
}
}