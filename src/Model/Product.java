package Model;

public class Product {
    private String p_id;
    private String name;
    private Double price;
    private String w_id;
    private int stocks;
    private Supplier s;


    public String getP_id() {
        return p_id;
    }
    public void setP_id(String p_id) {
        this.p_id = p_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getW_id() {
        return w_id;
    }
    public void setW_id(String w_id) {
        this.w_id = w_id;
    }
    public int getStocks() {
        return stocks;
    }
    public void setStocks(int stocks) {
        this.stocks = stocks;
    }
    public String getS_id() {
        return s.getS_id();
    }
    public void setS_id(Supplier s_id) {
        this.s = s_id;
    }

    @Override
    public String toString() {
        return "Product [p_id=" + p_id + ", name=" + name + ", price=" + price + ", w_id=" + w_id + ", stocks=" + stocks
                + "]";
    }

    public void reOrder(){
        System.out.println("Reorder bill created");
        // s.reOrder(this);
    }
}
