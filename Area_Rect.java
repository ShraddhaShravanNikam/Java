import java.io.*;
import java.util.*;
interface rectangle
{
   int l=20,b=30;
   void disp_rect();
}
interface circle 
{
  int red=40;
   void disp_circle();
}
class Cal_Rect implements rectangle,circle
{
   public void disp_rect()
{
   System.out.println("Area Rectangle ="+(l*b));
}
public void disp_circle()
{
 System.out.println("Area Circle ="+(3.14*red*red));
}
}
public class Area_Rect
{
  public static void main(String arg[])
{
   Cal_Rect c=new Cal_Rect();
   c.disp_rect();
   c.disp_circle(); 
}
}