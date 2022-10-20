package javaapplication17;

import java.util.Scanner;
class Logic
{
	int n;
	int nums[];
        
	Logic(int n)
	{
		this.n = n;
	}
	public void readNumbers()
	{
                synchronized(this){
		Scanner input = new Scanner(System.in);
		nums = new int[n];
		System.out.println("Enter " + n + " numbers");
		for(int i = 0; i < n; i++)
		{
			nums[i] = input.nextInt();
		}
                
                }
	}
	
        public void div5(){
              
                synchronized(this){
                System.out.println("numbers divisible by 5 are:");
                for(int i = 0;i<n;i++){
                    if(nums[i]%5==0){
                       System.out.println(nums[i]);
                    }
                }
                }
        }
	public void average()
	{
                synchronized(this){
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < n; i++)
			sum = sum + nums[i];
		avg = sum * 1.0/ n;
		System.out.println("Average is : " + avg);
                }
                     
	}
}

class MyThread1 extends Thread
{
	Logic l;
	MyThread1(Logic l)
	{
		this.l = l;
	}
	public void run()
	{
		l.readNumbers();
	}
}


class MyThread2 extends Thread
{
	Logic l;
	MyThread2(Logic l)
	{
		this.l = l;
		
	}
	public void run()
	{
		l.div5();
	}
}

class MyThread3 extends Thread
{
	
	Logic l;
	MyThread3(Logic l)
	{
		this.l = l;
		
	}
	public void run()
	{
		l.average();
	}
}

public class Driver1
{	
	public static void main(String[] args) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		Logic l = new Logic(n);
		MyThread1 t1 = new MyThread1(l);
		MyThread2 t2 = new MyThread2(l);
		MyThread3 t3 = new MyThread3(l);
                t1.start();
                t2.start();
                t3.start();
		
				
	}
}