package application;

import application1.GradeException;

import java.util.*;

public class TestGrade {

public static void main(String args[]) throws Exception {
    
Scanner input = new Scanner(System.in);

int[] ID = {1231, 1232, 1233, 1234, 1235,1236, 1237, 1238, 1239, 1240};
char[] Grade = new char[10];

String inString, outString = " ";

System.out.println("GRADES :\n"+"A\n"+"B\n"+"C\n"+"D\n"+"F");

for (int i = 0; i < ID.length; ++i)
 {
System.out.println("Enter  grade for student ID number: " + ID[i]);

inString = input.next();
grades[i] = inString.charAt(0);
try{
if(Grades[i] != 'A' && Grades[i] != 'B' && Grades[i] != 'C' &&

Grades[i] != 'D' && Grades[i] != 'F'&& Grades[i] !='I')

throw (new GradeException(Grades[i]));
}

catch(GradeException e)
 {

    Grades[i]='I';
    System.out.println("INVALID GRADE");
 }

}
for (int x = 0; x < ID.length; ++x)
    outString = outString + "ID : " + ID[i] + " Grade : " +
Grades[i] + "\n";
System.out.println(outString);
}
}