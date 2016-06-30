import java.util.*;
                         
public class StudentApp
 {
 
   public static void main(String args[])
   {
   String a;
   String b;
   String c;
   double d;
   
   Scanner scan=new Scanner(System.in);
   System.out.println("Hello, please enter your student number: ");
   a=scan.nextLine();
   System.out.println("Enter your Name: ");
   b=scan.nextLine();
   System.out.println("Enter your Programme: ");
   c=scan.nextLine();
   System.out.println("Enter your CGPA: ");
   d=scan.nextDouble();
   
    Student x=new Student(a,b,c,d);
    
    System.out.println("Student Number: "+x.stuNum);
    System.out.println("Name: "+x.stuName);
    System.out.println("Programme: "+x.stuProg);
    System.out.println("CGPA: "+x.cgpa);
   }  
   
 }
  
  
  
  
  
  
  