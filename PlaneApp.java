import java.util.*;

public class PlaneApp
{
   public static void main (String args [])
   {
      String a;
      int b;
      double c;
      int d;
      double e;
      
      Scanner x=new Scanner (System.in);
      Plane y= new Plane();
      y.displaychoice();
      
      System.out.print("Select your destination: ");
      a = x.nextLine();
      System.out.print("Class: ");
      b=x.nextInt();
      System.out.print("Quantity: ");
      d=x.nextInt();
      y.setPlane(a,b,d);
      y.setDestination(a,b,d);
      System.out.print(y.toString());
      
   }
}