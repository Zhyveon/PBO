
package practice53;

import java.util.Scanner;


public class Practice53 {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a color code : ");
int code = sc.nextInt();
switch (code) {
            case 1 : System.out.println("Next Traffic Light is Green");
break;
            case 2 : System.out.println("Next Traffic Light is Yellow");
break;
            case 3 : System.out.println("Next Traffic Light is Red");  
                break;
            default:

                System.out.println("Invalid color");
    }
    }
}
