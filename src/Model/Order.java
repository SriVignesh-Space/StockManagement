package Model;

public class Order {
    private String o_id;
    private String w_id; 
    private String p_id;
    private int quantity;
    private String location;


    public String getO_id() {   
        return o_id;
    }
    public String getW_id() {
        return w_id;
    }
    public String getP_id() {
        return p_id;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getLocation() {
        return location;
    }
    public void setO_id(String o_id) {
        this.o_id = o_id;
    }
    public void setW_id(String w_id) {
        this.w_id = w_id;
    }
    public void setP_id(String p_id) {
        this.p_id = p_id;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public String toString() {
        return "Order [o_id=" + o_id + ", w_id=" + w_id + ", p_id=" + p_id + ", quantity=" + quantity + ", location="
                + location + "]";
    }

    
}
