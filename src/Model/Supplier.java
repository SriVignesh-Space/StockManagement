package Model;

import java.util.ArrayList;

public class Supplier {
    private String s_id;
    private String product_name;
    private String product_id;
    private double price;
    private String w_id;

    ArrayList<Product> reorder = new ArrayList<>();



    public void reOrder(Product p){
        reorder.add(p);
        System.out.println("Reorder Bill Created");
    }



    public String getS_id() {
        return s_id;
    }



    public void setS_id(String s_id) {
        this.s_id = s_id;
    }



    public String getProduct_name() {
        return product_name;
    }



    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }



    public String getProduct_id() {
        return product_id;
    }



    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    public String getW_id() {
        return w_id;
    }



    public void setW_id(String w_id) {
        this.w_id = w_id;
    }



    public ArrayList<Product> getReorder() {
        return reorder;
    }



    public void setReorder(ArrayList<Product> reorder) {
        this.reorder = reorder;
    }


    
}
