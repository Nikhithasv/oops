package javaapplication18;

class Bank {
 
    
    int total = 100;
 
   
    synchronized void withdrawn(String name,
                                       int withdrawal)
    {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                               + withdrawal);
            total = total - withdrawal;
            System.out.println("Balance after withdrawal: "
                               + total);
            
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
           
        }
       
        
        else {
            System.out.println(name
                               + " you can not withdraw "
                               + withdrawal);
            System.out.println("your balance is: " + total);
 
            
            try {
 
      
                wait();
            }
 
        
            catch (InterruptedException e) {
 
                
                System.out.println(e);
            }
         
        }
        notifyAll();
    }
 
    
    synchronized void deposit(String name,
                                     int deposit)
    {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                           + total);
 
        
        try {
 
            
          wait();
        }
 
        
        catch (InterruptedException e) {
 
          System.out.println(e);
        }
     	notify();
    }
    
}
 

class Withdrawal extends Thread{
 
    
    Bank object;
    String name;
    int rupee;
 
   
    Withdrawal(Bank ob, String name, int money)
    {
       
        this.object = ob;
        this.name = name;
        this.rupee = money;
    }
 
  
    public void run() { object.withdrawn(name, rupee); }
}
 

class Deposit extends Thread {
 
    Bank object;
    String name;
    int rupee;
 
    Deposit(Bank ob, String name, int money)
    {
        this.object = ob;
        this.name = name;
        this.rupee = money;
    }
 
    public void run() { object.deposit(name, rupee); }
}
 

public class info {
 
    
    public static void main(String[] args)
    {
        
        Bank obj = new Bank();
 
        
        Withdrawal t1
            = new Withdrawal(obj, "Aishwarya", 20);
        Withdrawal t2
            = new Withdrawal(obj, "kushi", 40);
        Deposit t3
            = new Deposit(obj, "Muthu", 35);
        Withdrawal t4
            = new Withdrawal(obj, "nikhi", 80);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}