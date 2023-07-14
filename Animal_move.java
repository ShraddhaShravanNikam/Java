import java.io.*;
import java.util.*;
class animal
{
   public void move()
{
   System.out.println("Animal move");
}
}
class Dog extends animal
{
   
   public void move()
{
    super.move();
   System.out.println("Dog ");
}
}
class Animal_move
{
public static void main(String arg[])
{
  Dog b=new Dog();
  b.move();
   
}
}