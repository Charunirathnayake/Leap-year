/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

/**
 *
 * @author charuni
 */import java.util.Scanner;
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the year");
        int year=input.nextInt();
        if(year%4==0&&year%100!=0){
            System.out.println(year+"is leap year");
    }
        else{
            System.out.println(year+"is not leap year");
        }
}
}