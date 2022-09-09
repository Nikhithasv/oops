import java.util.Scanner;
class bill {
    public static void main(String[] args) {
        SuperMarket a = new SuperMarket();
        System.out.println(".........SUPER MARKET BILL........");
        a.calculateBill();
        a.display();
        Restaurant b = new Restaurant();
        System.out.println(".........RESTAURANT BILL........");
        b.calculateBill();
        b.display();
    }
}
interface printing_statement{
    void calculateBill();//considers as public abstract void calculateBill();
    void display();
}
class SuperMarket implements printing_statement{
    String customer_name;
    String Customer_id;
    int n;
    String product_name;  
    int qty;  
    int price;  
    int totalamount;  
    int amount=0,discount,total,gst,payable_amount;
    public void calculateBill(){
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF PRODUCTS:");
        n = obj.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println("ENTER PRODUCTNAME:");
            product_name = obj.next();
            System.out.println("ENTER QUANTITY:");
            qty = obj.nextInt();
            System.out.println("ENTER PRICE:");
            price = obj.nextInt();
            totalamount = price * qty;
            amount = amount+totalamount;
        }
        discount = amount*2/100; 
        total = amount - discount;
        gst=amount*12/100;  
        payable_amount = total+gst;
    }
    public void display(){
        System.out.println("..............BILL..............");
        System.out.println("AMOUNT : "+amount);
        System.out.println("DISCOUNT : "+discount);
        System.out.println("TOTAL : "+total);
        System.out.println("GST : "+gst);
        System.out.println("AMOUNT TO BE PAID : "+payable_amount);
        System.out.println("THANK YOU FOR SHOPPING");
        
    }
}
class Restaurant implements printing_statement{
        int amount=0;
        int price,qty;
        String order="";
        String dish_name;
        int n,totalamt;
        
        public void calculateBill(){ 
            Scanner obj1= new Scanner(System.in);
            System.out.println("ENTER NUMBER OF ORDERS:");
            n = obj1.nextInt();
            for(int i =1;i<=n;i++){
                System.out.println("ENTER DISHNAME:");
                dish_name = obj1.next();
                System.out.println("ENTER QUANTITY:");
                qty = obj1.nextInt();
                System.out.println("ENTER RATE:");
                price = obj1.nextInt();
                totalamt = price * qty;
                order=order.concat(dish_name+"  "+totalamt+"\n");
                amount = amount+totalamt;
            }
        }       
            
        public void display(){   
            System.out.println("..............BILL..............");
            System.out.println("YOUR ORDERS ARE:\n"+order);
            System.out.println("YOUR BILL AMOUNT="+amount);
            System.out.println("THANK YOU FOR ORDERING");
    }
    
}