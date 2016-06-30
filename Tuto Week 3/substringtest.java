import java.io.*;

public class substringtest
{
   public static void main(String args[])
   {
      String Str = new String("How deep is your love?");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(4) );

      System.out.print("Return Value :" );
      System.out.println(Str.substring(12, 22) );
   }
}