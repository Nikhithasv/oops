package demo;


public class Demo {

   
        
    public void convertlmin(int hr){
       int m = hr*60;
       System.out.println("HOURS TO MINS : "+m);
    }
     public void convertlsec(int hr){
       int S = hr*3600;
       System.out.println("HOURS TO SECS : "+S);
    }
    public void converthm(double min){
        double H = min/60;
        System.out.println("MINS TO HOURS: "+H);      
   
}
     public void converths(double sec){
        double HR = sec/3600;
        System.out.println("SECS TO HOURS : "+HR);      
   
}

   
    public static void main(String[] args) {
        
        System.out.println("TIME CONVERTER");
    }
   
    }