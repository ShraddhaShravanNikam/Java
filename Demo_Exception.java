import java.io.*;
import java.util.*;
class Exception_Pass extends Exception
{
     Exception_Pass(String str)
{
   System.out.println(str);
}
}
class Demo_Exception
{
  public static void main(String arg[])
{
  String pass="a123";
  try
{
  if(pass=="123")
{
  System.out.println("Password Match");
}
else
{
  throw new Exception_Pass("No Password match ");
}
}
catch(Exception_Pass e)
{
 System.out.println(e);
}
}
}