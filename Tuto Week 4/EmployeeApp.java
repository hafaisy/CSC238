import java.util.*;
public class EmployeeApp
{
   public static void main(String args[])
  {
    String a;
    String b;
    String c;
    
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter Name: ");
    a=scan.nextLine();
    System.out.print("Enter the Designation: ");
    b=scan.nextLine();
    System.out.print("Enter the ID: ");
    c=scan.nextLine();
    
    
    Employee x=new Employee(a,b,c);
    System.out.println("Name: "+x.EmpName);
    System.out.println("Director: "+x.EmpDesg);
    System.out.println("Duration: "+x.EmpID);
    
   }
}