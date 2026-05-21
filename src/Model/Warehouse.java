package Model;

import java.util.ArrayList;

public class Warehouse {
    private String w_id;
    private String location;
    private Double totalSelling = 0.0;

    public Double getTotalSelling() {
        return totalSelling;
    }

    public void setTotalSelling(Double totalSelling) {
        this.totalSelling = totalSelling;
    }

    private ArrayList<Product> products = new ArrayList<>();

    public void getProductList(){
        for(Product p : products){
            System.out.println(p.toString());
        }
    }

    public void updateOrder(Product p){
        p.reOrder();
        System.out.println("Reordered stock");
    }

    public String getW_id() {
        return w_id;
    }

    public void setW_id(String w_id) {
        this.w_id = w_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Warehouse [w_id=" + w_id + ", location=" + location + ", totalSelling=" + totalSelling + ", products="
                + products + "]";
    }

    
}
