
package practice.pkg6.pkg2;

import java.util.Scanner;


public class Practice62 {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number For Loop : ");
int Number = sc.nextInt();
       for (int a=1; a<13;a++){
           int Value = Number * a;
           System.out.println(Value);
       }
    }
    
}
