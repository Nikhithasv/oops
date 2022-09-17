package subclass1;
import subclass.*;
    class newmain extends newmain1 {
        public static void main(String[] args){
            newmain obj = new newmain();
            obj.display();
            try{
                obj.display1();
            }
            catch(Exception e){
                System.out.println("default property cannot be displayed");
            }
        }
    
}

