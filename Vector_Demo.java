import java.io.*;
import java.util.*;
import java.lang.*;
class Vector_Demo
{
  public static void main(String arg[])
{
  Vector v1=new Vector();
  v1.addElement(new Integer(5));
 v1.addElement(new Integer(50));
 v1.addElement(new Double(59.09));
 System.out.println("Size ="+v1.size()); 
for(int i=0;i<v1.size();i++)
{
 System.out.println("element ="+v1.get(i));   
}
v1.removeElementAt(1);
for(int i=0;i<v1.size();i++)
{
 System.out.println("element ="+v1.get(i));   
}
System.out.println("Size ="+v1.size()); 
v1.set(1,"100");
for(int i=0;i<v1.size();i++)
{
 System.out.println("element ="+v1.get(i));   
}
System.out.println("Size ="+v1.size()); 
}
}