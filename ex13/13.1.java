package Collections;

/**
 *
 * @author NIKHITHA
 */

import java.util.*;


public class testArrayList {        

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        ArrayList <Integer> num = new ArrayList<Integer>();
        ArrayList <Integer> even = new ArrayList<Integer>();
        ArrayList <Integer> odd = new ArrayList<Integer>();
        System.out.println("Enter a number");
                        
        System.out.println("(0 to end): ");
       while(inputs.hasNextInt()) {
    int nums = inputs.nextInt();
    if (nums == 0) {
        break;
    }
    num.add(nums);
}
System.out.println(num);
 int sum =0;
for (int i : num)   
{  
sum+=i;  
}  
System.out.println("The average of the List is: " + sum/(float)num.size());  
System.out.println("Lowest Element in List = "
                           + Collections.min(num));
System.out.println("Highest Element in List = "
                           + Collections.max(num));
for (int i = 0; i < num.size(); i++) {
 int n = num.get(i);
 if (n % 2 == 0) {
 even.add(n);
 } 
 else{
     odd.add(n);
 }
}
System.out.println("filter even numbers in list : "+even);
System.out.println("filter odd numbers in list : "+odd);
    }
}
