import java.util.Scanner;

public class Verifiers{
   Scanner sc = new Scanner(System.in);
   int x;
   String y;
   
   int check(){
      while(!sc.hasNextInt()){
         System.out.print("Please input an integer only: ");
         sc.next();
      }
      x=sc.nextInt();
      sc.nextLine();
      return x;
   }
   
   String checkString() {
    String j = sc.nextLine();
    while (j.isEmpty()) {
        System.out.print("Please input again: ");
        j = sc.nextLine();
    }
    return j;
}
}