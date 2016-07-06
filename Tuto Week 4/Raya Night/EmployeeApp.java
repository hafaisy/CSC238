import java.util.*;

public class EmployeeApp
{
  public static void main(String[] args)
  {
  String a,b,c;
  
  Scanner x=new Scanner(System.in);
  Employee y=new Employee();
  
  y.getEmployee();
  System.out.println(y.getEmployee()+"\n");
  
  System.out.print("Name: ");
  a=x.nextLine();
  System.out.print("Designation: ");
  b=x.nextLine();
  System.out.print("ID: ");
  c=x.nextLine();
  
  y.setEmployee(a,b,c);
  System.out.println("\n"+y.toEmployee());
  }
}