import java.io.*;
import java.util.*;
class File_Char_Search
{
  public static void main(String arg[]) throws IOException
{
   FileInputStream fin=new FileInputStream("File_Char.txt");
   int x,count=0;
while((x=fin.read())!=-1)
{
   char ch=(char)x;
  if(ch=='a')
{
  count++;
}
}
System.out.println("Count ="+count);
fin.close();
}
}