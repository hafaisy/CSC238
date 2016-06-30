
import java.util.*;
public class Sum
{

public static void main(String[]args)
{
 int num1,num2,sum;
 Scanner scan=new Scanner (System.in);
 System.out.println("Enter number 1: ");
 num1=scan.nextInt();
 System.out.println("Enter number 2: ");
 num2=scan.nextInt();
 sum=num1+num2;
 System.out.print("The Sum for the two number is: ");
 System.out.print(sum);
}
}