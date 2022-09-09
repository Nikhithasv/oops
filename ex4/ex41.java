import java.util.Scanner;


public class datails {
    public static void main(String[] args){
        person a = new student_details();
        System.out.print("STUDENT DETAILS : ");
        a.getdata();
        a.display();
        
         System.out.print("FACULTY DETAILS : ");
        person b = new faculty_details();
        b.getdata();
        b.display();
       
    }
   
}
abstract class person{
    abstract void getdata();
    abstract void display();
}
class student_details extends person{

   
    String student_name;
    int aadhar_no;
    int n, total = 0, avg;
    @Override
    void getdata(){
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        student_name = s.next();
        System.out.println("Enter aadhar number:");
        aadhar_no = s.nextInt();
        System.out.println("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
            for(int i = 0; i < n; i++)
            {
                marks[i] = s.nextInt();
                System.out.println("mark:"+i);  
                total = total + marks[i];
              
            } 
            avg = total / n;
             
         }

    @Override
    void display() {
            int i;
            System.out.println("....STUDENT DETAILS....");
            System.out.println("Name:"+student_name);
            System.out.println("aadhar:"+aadhar_no);
            
            System.out.println("total:"+total);
            System.out.println("average:"+avg);
   
    }
}
class faculty_details extends person{
    String faculty_name;
    int aadhar_no;
    int id;
    String faculty_dept;
    int Salary;
    @Override
    void getdata() {
        System.out.println("Enter Name:");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        faculty_name = s.next();
        System.out.println("Enter aadhar number:");
        aadhar_no = s.nextInt();
        System.out.println("Enter ID:");
        id = s.nextInt();
        System.out.println("Enter department:");
        faculty_dept = s.next();
        System.out.println("Enter Salary:");
        Salary = s.nextInt();
       
    }

    @Override
    void display() {
        System.out.println("....FACULTY DETAILS....");
        System.out.println("Name:"+faculty_name);
        System.out.println("aadharno:"+aadhar_no);
        System.out.println("id:"+id);
        System.out.println("department:"+faculty_dept);
        System.out.println("salary:"+Salary);
    }
   
   
} 
 