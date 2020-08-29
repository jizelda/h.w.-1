import java.util.Scanner;
class Main {
 public static void main(String[] args) {
   int a = 4;
   int b = 5;
   a *= b;
   b = a/b;
   a = a/b;
   System.out.println(a==5);
   System.out.println(b==4);
 }
}
