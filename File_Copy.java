import java.io.*;
import java.util.*;
class File_Count
{
  public static void main(String arg[]) throws IOException
{
  FileInputStream fin=new FileInputStream("Input.txt");
  FileOutputStream fout=new FileOutputStream("Output.txt");
  int x;
 while((x=fin.read())!=-1)
{
 fout.write(x);
}

System.out.println("Succesfull");
fin.close();
fout.close();
}
}