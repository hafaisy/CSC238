import java.util.*;
public class DispInfo
{
public static void main(String[]args)
{
String name;
 long ic;
 int age;
 float salary;
 System.out.println("Enter the Name: ");
 Scanner scan=new Scanner (System.in);
 name=scan.nextLine();
 System.out.println("Enter IC Number: ");
 ic=scan.nextLong();
 System.out.println("Enter Age: ");
 age=scan.nextInt();
 System.out.println("Enter Salary: ");
 salary=scan.nextFloat();
 System.out.println("The information is : ");
 System.out.println("Name :"+name);
 System.out.println("IC Number :"+ic);
 System.out.println("Age :"+age);
 System.out.println("Salary :RM"+salary);
}
}

average,4 student