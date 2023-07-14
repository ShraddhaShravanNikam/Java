import java.io.*;
import java.util.*;
import java.lang.*;
class Complex
{
   
  int real,img;
  Complex()
{
   real=20;
   img=30;
}
Complex(int r,int i)
{
  real=r;
  img=i;
}
Complex(Complex c1,Complex c2)
{
   System.out.println("Addition =");
 System.out.println((c1.real+c2.real)+"+"+(c1.img+c2.img)+"i");
}
public static void main(String arg[])
{
   Complex c1=new Complex();
   Complex c2=new Complex(10,30);
   Complex c3=new Complex(c1,c2);

}

}