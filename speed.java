import java.util.Scanner;
public class speed {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);

  System.out.println("Enter the Distance in Km/h:");
     double d=cs.nextDouble();

     System.out.println("Enter the Time in Hrs:");
     double t=cs.nextDouble();

     double speed=d/t;
     
     System.out.println("Speed is "+speed+" (Km/Hr)");
     cs.close();
 }
}
