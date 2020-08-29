import java.util.Scanner;
class Main {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("number plz");
   float num = sc.nextFloat();
   float numNEW = num*num;
   System.out.println("The square of " +num +" is " +numNEW);
 }
}
