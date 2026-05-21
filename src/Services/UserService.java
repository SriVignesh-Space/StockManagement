package Services;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Order;
import Model.Product;
import Model.Warehouse;

public class UserService {

    Scanner sc ;
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<Warehouse> warehouses = new ArrayList<>();
    Warehouse max_Warehouse = null;
    Product  top_product = null;
    double price = 0.0;

    public void placeOrder(Order o){
        orders.add(o);
        for(Warehouse w : warehouses){
            System.out.println(w.toString());
            for(Product p : w.getProducts()){
                if(o.getP_id().equalsIgnoreCase(p.getP_id())){
                    if(o.getQuantity() > p.getStocks()){
                        System.out.println("Available Quantity : "+ p.getStocks() + " in warehouse : " + w.getW_id() );
                    }
                    else{
                        p.setStocks(p.getStocks() - o.getQuantity());
                        if(p.getStocks() == 0){
                            w.updateOrder(p);
                            System.out.println("ReOrdering....");
                        }
                        w.setTotalSelling(w.getTotalSelling()+ o.getQuantity() * p.getPrice());

                        if(max_Warehouse == null){
                            max_Warehouse = w;
                        }
                        else{
                            if(max_Warehouse.getTotalSelling() < w.getTotalSelling()){
                                max_Warehouse = w;
                            }
                        }

                        if(price < o.getQuantity() * p.getPrice()){
                            price = o.getQuantity() * p.getPrice();
                            top_product = p;
                        }
                        System.out.println("Order successfull");
                    }
                }
            }
        }
    }

    public void Report(){
        if(max_Warehouse != null){
            System.out.println("\nTop Warehouse with Highest TurnOver Rate");
            System.out.println(max_Warehouse.toString());
        }

        if(top_product != null){
            System.out.println("\nTop Product Across Warehouse");
            System.out.println(top_product.toString());
        }
    }

    public void start(Scanner s){
        sc = s;
        Warehouse w1 = new Warehouse();
        w1.setW_id("1");
        w1.setLocation("Chennai");
        
        Product p1 = new Product();
        p1.setName("Prod 1");
        p1.setP_id("p1");
        p1.setPrice(1000.0);
        p1.setStocks(1000);
        p1.setW_id("1");
        
        
        w1.getProducts().add(p1);
        warehouses.add(w1);
        System.out.println("Prod 1 added");

        Order o1 = new Order();
        o1.setO_id("1");
        o1.setP_id("p1");
        o1.setQuantity(100);
        o1.setW_id("1");
        o1.setLocation("Thanjavur");

        System.out.println("Order created");
        System.out.println(o1.toString());

        placeOrder(o1);

        Report();
    }
}
