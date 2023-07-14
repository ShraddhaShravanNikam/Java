import java.io.*;
class File_Line_Find
{
  public static void main(String arg[])
{
  FileInputStream fin=new FileInputStream("File_Line.txt");
  int x,count=0;  
  while((x=fin.read())!=-1)
{
 char ch=(char)x;
  if(ch=='\n')
{
  count++;
}
}
System.out.println("Lines Present in File ="+count);
}
}