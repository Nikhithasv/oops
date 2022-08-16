/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 21cse078
 */
import java.util.Scanner;
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i;
        // TODO code application logic here
        System.out.println("enter the value of n");
        int n=obj.nextInt();
        System.out.println("sequence are:");
        for(i=1;i<=n;i++)
        {
            System.out.print(i);
        }
    }
    
}
