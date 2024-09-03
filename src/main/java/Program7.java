package src.main.java;
//import stuff here
import java.util.Scanner;
//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**
    final int shruteToKlev = 20;
    final int klevToStan = 12;
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("input shrute-bucks:");
        int shrute = s.nextInt();
        System.out.println("input klevins:");
        int klevin = s.nextInt();
        System.out.println("input stanley-nickels:");
        int stan = s.nextInt();
        Program7 j = new Program7();
        double h = j.convertMoney(shrute,stan,klevin);
        System.out.println(h);
    }
    
    
    
    public double convertMoney(int shrute, int stan, int klevin){
        //implement a function that converts from the old format to the new format
        double q = shrute+((double)klevin/shruteToKlev)+((double)stan/klevToStan/(double)shruteToKlev);
        q = 100*q;
        q = Math.floor(q);
        q = q/100;
        return q;
    }
    
    //Paste console output below:
    /*
     input shrute-bucks:
    3
    input klevins:
    10
    input stanley-nickels:
    12
    3.55
    */
     
    
}
