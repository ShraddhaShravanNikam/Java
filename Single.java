import java.io.*;
import java.util.*;
class A
{
   int a=20;
     void disp()
{
    System.out.println(" Value of A ="+a); 
}
}
class B extends A
{
   int b=30;
   void disp()
{
  
    System.out.println("Value of b ="+b);  
}

class Method_Overriden
{
   public static void main(String arg[])
{
    B obj=new B();
    obj.disp();
    
}
}