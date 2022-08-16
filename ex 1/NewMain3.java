/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
 import java.util.Scanner;
/**
 *
 * @author 21cse078
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER UNIT PRICE:");
        int price = obj.nextInt();
        System.out.println("ENTER QUANTITY:");
        int quantity = obj.nextInt();
        int rev = price * quantity;
        System.out.println("THE REVENUE FROM THE SALE :"+ rev);
        if(quantity>=100 & quantity<=120){
            int p = (rev*10)/100;
            System.out.println("AFTER DISCOUNT :" +p);
        }
        else if(quantity>120){
            int p = (rev*15)/100;
            System.out.println("AFTER DISCOUNT :" +p);
        }
        else{
            int p = rev;
            System.out.println("AMOUNT : "+ p);
        }
       
    }
}

   