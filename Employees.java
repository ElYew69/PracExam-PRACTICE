import java.util.Scanner;

public class Employees{
   private int Id;
   private String Name;
   private String Position;
   private int Hrs;
   private String Dept;
   private double Salary;
   
   public Employees(int idc, String namec, String positionc, int hrsc, String deptc, double salaryc){
      this.Id=idc;
      this.Name=namec;
      this.Position=positionc;
      this.Hrs=hrsc;
      this.Dept=deptc;
      this.Salary=salaryc;
   }
   
   void calcPay(){
      double Payroll=Salary * (double)Hrs;
      System.out.println("Your total pay is P" +Payroll);
   }   
   
   //----Getter Methods----
   public int getId(){
      return Id;
   }
   public String getName(){
      return Name;
   }
   public String getPosition(){
      return Position;
   }
   public int getHrs(){
      return Hrs;
   }
   public String getDept(){
      return Dept;
   }
   public double getSalary(){
      return Salary;
   }
}