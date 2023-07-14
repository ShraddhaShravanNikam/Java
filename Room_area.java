import java.io.*;
import java.util.*;
 class Room
{
  int l=200,b=300,h=300;
  public void area()
{
   System.out.println("Area ="+(l*b*h));
}
}
 class Room_Volume extends Room
{
public void volume()
{
    System.out.println("volume ="+2*((l*b)+(b*h)+(l*h)));
}
}
public class Room_area
{
  public static void main(String arg[])
{
  Room_Volume R=new Room_Volume();
  R.area();
  R.volume();
}
}