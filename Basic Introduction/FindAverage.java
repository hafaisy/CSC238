import java.util.*;
public class FindAverage
{
public static void main(String[]args)
{
 float num1,num2,num3,num4,sum,avg;
 Scanner scan=new Scanner (System.in);
 System.out.println("Enter number 1: ");
 num1=scan.nextFloat();
 System.out.println("Enter number 2: ");
 num2=scan.nextFloat();
 System.out.println("Enter number 3: ");
 num3=scan.nextFloat();
 System.out.println("Enter number 4: ");
 num4=scan.nextFloat();
 sum=num1+num2+num3+num4;
 avg=sum/4;
 System.out.print("The Average for the for number is: ");
 System.out.print(avg);
}
}