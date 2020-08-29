import java.util.Scanner;
class Main {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("2 numbers plz (in separete lines)");
   float num1 = sc.nextFloat();
   float num2 = sc.nextFloat();
   float sum = num1+num2;
   System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
 }
}
