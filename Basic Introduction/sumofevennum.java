import java.util.*;
public class sumofevennum
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
  if((i%2)==0){
  System.out.print(i+" ");
    sum=sum+i;
    }
 }
 
 System.out.print("\nThe sum of "+number+" the numbers "+sum);
}
} 