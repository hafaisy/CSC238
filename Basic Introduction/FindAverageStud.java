import java.util.*;
public class FindAverageStud
{
  public static void main(String[]args)
  {
   int stud;
   float sum=0,avg=0,mark;
   Scanner scan=new Scanner (System.in);
   for(stud=0;stud<5;stud++)
     {
     System.out.println("Enter mark for Student "+(stud+1));
     mark=scan.nextFloat();
     sum+=mark;
     }
    System.out.println("The Sum is:"+sum);
    avg=sum/5;
   System.out.println("The average is:"+avg);
   }
}