package packagee;


import packagee.pack1.*;
import packagee.pack2.*;
import packagee.pack3.*;
public class test {

    public static void main(String[] args) {
        
        package1.pack1.test1 t = new package1.pack1.ap1();
        package1.pack2.test2 t1 = new package1.pack2.ap2();
        package1.pack3.test3 t2 = new package1.pack3.ap3();
        t.display();
        t1.display();
        t2.display();
    }
    
}