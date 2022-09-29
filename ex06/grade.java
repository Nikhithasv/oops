package application1;

public class GradeException extends Exception {

   char t;

    
public GradeException(char a) {
     this.t = a;
}
}