/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21cse078
 */
import java.util.*;
public class Phnumber {
    public static void main(String[] args) {
        

     Scanner no=new Scanner(System.in);

     String number= "";

     String fdnumber="";

     
     while(true)

     {

       System.out.println("Enter the valid phone number: ");

         String phnumber = no.nextLine();

       

       if(phnumber.equalsIgnoreCase("999"))

        break;

         if(phnumber.length() < 10)

         System.out.println("Invalid phone number,please enter the valid phone number .");

         else {

           
           System.out.println("phone number after formating: ");
           
           fdnumber+= ("(" + phnumber.substring(0, 3) + ")"+phnumber.substring(3, 6)+"-"+phnumber.substring(6, phnumber.length()));

         
         
           System.out.println(fdnumber);

           }

       }

     }

   }
 
