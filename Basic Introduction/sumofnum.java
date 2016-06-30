import java.util.*;
public class sumofnum
{

public static void main(String[]args)
{
 int number;
 int sum=0;
 System.out.print("Please enter the number: ");
 Scanner scan=new Scanner (System.in);
 number=scan.nextInt();
 for(int i=1;i<=number;i++)
 {
    sum=sum+i;
 }
 System.out.print("The sum of "+number+" the numbers "+sum);
}
}