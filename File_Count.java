import java.io.*;
import java.util.*;
class File_Count
{
  public static void main(String arg[]) throws IOException
{
   FileInputStream fin =new FileInputStream("Filec.txt");
   int x,count=0;
  while((x=fin.read())!=-1)
{
   count++;
}
System.out.println("Count ="+count);
}
}