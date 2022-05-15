
package practice.pkg5.pkg2;

import java.util.Scanner;


public class Practice52 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a color code : ");
int code = sc.nextInt();

if   (code == 1){
            System.out.println("Next Traffic Light is Green");
      }
else if   (code == 2){
            System.out.println("Next Traffic Light is Yellow");
    }
else if   (code == 3){
            System.out.println("Next Traffic Light is Red");
    }
}
}
