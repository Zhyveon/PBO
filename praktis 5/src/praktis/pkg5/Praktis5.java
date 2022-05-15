
package praktis.pkg5;

import java.util.Scanner;

public class Praktis5 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print(" Masukan Wavelength : ");
int Wavelength = sc.nextInt();
 if(Wavelength>=380 && Wavelength <450){
        System.out.println("The color is Violet");
    }
else if(Wavelength>=450 && Wavelength <495){
        System.out.println("The color is Blue");
    }
else if(Wavelength>=495 && Wavelength <570){
        System.out.println("The color is Green");
    }
else if(Wavelength>=570 && Wavelength <590){
        System.out.println("The color is Yellow");
    }
else if(Wavelength>=590 && Wavelength <620){
        System.out.println("The color is Orange");
    }
else if(Wavelength>=620 && Wavelength <750){
        System.out.println("The color is Red");
    }
}
    
}
