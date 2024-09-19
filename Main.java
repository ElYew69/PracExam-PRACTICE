import java.util.Scanner;
import java.util.ArrayList;

public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      Verifiers verify = new Verifiers();
      ArrayList<Employees> EmpList = new ArrayList<>();
      
      //----utility----
      String again = "yes";
    
      //----data----
      String name;
      int id;
      String pos;
      int hrs;
      String dept="";
      double salary=0.0;
      
     
     System.out.println("Input employee's data");
      
      do{
         System.out.print("Enter employee's id number: ");
         id = verify.check();
         System.out.print("Enter employee's family name: ");
         name=verify.checkString();
         System.out.print("Enter position of the employee: ");
         pos=verify.checkString();
         System.out.print("Enter employee's hours worked: ");
         hrs = verify.check();
         
         switch(pos.toLowerCase()){
            case "developer":
               dept= "RND department";
               salary=720.00;
            break;
            case "QA":
               dept= "RND department";
               salary=900.00;
            break;
            
            case "manager":
               dept="Office department";
               salary=950.00;
            break;
            case "secretary":
               dept="Office department";
               salary=1000.00;
            break;
            
            case "salesperson":
               dept="Sales department";
               salary=875.00;
            break;
            case "social media manager":
               dept="Sales department";
               salary=690.00;
            break; 
            
            case "Maintenance":
               dept="Utility department";
               salary=200.00; 
            break; 
            case "Technician":
               dept="Utility department";
               salary=400.00;
            break; 
            }
      
         
         Employees employee = new Employees(id,name,pos,hrs,dept,salary);
         EmpList.add(employee);
         
         System.out.println("----Data Entered----");
         System.out.println("Employee's id number is "+id);
         System.out.println("Employee's family name: "+name);
         System.out.println("Employee's position: "+pos);
         System.out.println("Employee's hours worked: "+hrs);
         
         
         System.out.print("Add another employee? yes / no === ");
         again=sc.nextLine();
         
      }while(again.equalsIgnoreCase("yes"));
      for(Employees emp : EmpList){
         System.out.println("----Employee----");
         System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() +
                               ", Position: " + emp.getPosition() + ", Hours Worked: " + emp.getHrs() +
                               ", Department: " + emp.getDept() + ", Salary: $" + emp.getSalary());
            emp.calcPay();      
      }
   }
}
