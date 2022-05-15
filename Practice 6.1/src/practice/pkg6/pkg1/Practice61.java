
package practice.pkg6.pkg1;

import java.util.Scanner;


public class Practice61 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Your PIN : ");
int PIN = sc.nextInt();
        while (PIN != 1234567){
            System.out.println(" Your PIN is Incorrect");
            System.out.print(" Enter Your PIN : ");
               PIN = sc.nextInt();
            }
        System.out.println("Your PIN is Correct");

    }
    
}
