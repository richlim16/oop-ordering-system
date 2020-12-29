
package customer;
import java.util.ArrayList;

public class Receipt {
    private ArrayList<Order> receipt = new ArrayList<Order>();
    private double total = 0;
    public Receipt(){}
    
    public void addOrder(Order o){
        receipt.add(o);
    }
    
    public double getTotal(){
        return this.total;
    }
    
    public String print(){
        StringBuilder sb = new StringBuilder();
        for(Order x : receipt){
            sb.append(x.getName()+"\t Php "+x.getPrice()+"\n");
            this.total+= x.getPrice();
        }
        sb.append("Total Price: Php "+ this.total);
        System.out.println(sb.toString());
        return sb.toString();
    }
}
