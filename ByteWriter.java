import java.io.*;
import java.util.*;
public class ByteWriter
{
   public static void main(String arg[]) throws IOException
{
   byte b[]=new byte[100];
   System.out.println("Enter a number =");
   int bytes = System.in.read(b);
   FileOutputStream fout =new FileOutputStream("Sample.txt");
   fout.write(b,0,bytes);
   System.out.println("Save ");
   fout.close();
  
}
}

public static void main(String arg[])
{
  byte b[]=new byte[100];
  S.O.P("Enter a byte value =");
  int bytes=System.in.read(b);

   FileOutputStream fout=new FileOutputStream("Sample.txt");
   fout.write(b,0,bytes);
   S.O.P("Saved");
   fout.close();
}
}