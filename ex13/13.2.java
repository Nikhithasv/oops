package Collections;



/**
 *
 * @author NIKHITHA
 */


 

import java.util.*;

 
// create the employee class

class employee{

   

    String name;

    int salary;

 

    // constructor

    employee(String name, int salary)

    {

         

        this.name = name;

        this.salary = salary;

    }
}

 
// creates the comparator for comparing name

class name implements Comparator<employee> {

 

    // override the compare() method

    public int compare(employee s1,employee s2)

    {
      
        
        return s2.name.compareTo(s1.name);

    }
}



public class sort {

    public static void main(String[] args)

    {

        // create the ArrayList object

        ArrayList<employee> s = new ArrayList<>();

        s.add(new employee( "a", 10000));

        s.add(new employee("b", 1000));

        s.add(new employee( "c", 1000));
        s.add(new employee( "d", 1000));
        s.add(new employee( "e", 1000));
        s.add(new employee( "f", 1000));
        s.add(new employee( "g", 1000));
        s.add(new employee( "h", 1000));
        s.add(new employee( "i", 1000));
        s.add(new employee( "j", 1000));
        s.add(new employee( "k", 1000));
        s.add(new employee( "l", 1000));
        s.add(new employee( "m", 1000));
        s.add(new employee( "n", 1000));
        s.add(new employee( "o", 1000));
        s.add(new employee( "p", 1000));
        s.add(new employee( "q", 1000));
        s.add(new employee( "r", 1000));
        s.add(new employee( "s", 1000));
        s.add(new employee( "t", 1000));
       
 

        System.out.println("before sorting");

        for (employee employee : s) {

            System.out.println( employee.name

                               + " " + employee.salary);

        }

       

 

        System.out.println(

            "After sorting(sorted by Name)");

 

        // call the sort function

        Collections.sort(s, new name());

        for (employee employee : s) {

            System.out.println (employee.name

                               + " " + employee.salary);

        }

    }
}