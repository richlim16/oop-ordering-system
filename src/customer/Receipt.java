
package customer;
import java.util.ArrayList;

public class Receipt {
    private ArrayList<Order> receipt = new ArrayList<Order>();
    public Receipt(){}
    
    public void addOrder(Order o){
        receipt.add(o);
    }
    
    public String print(){
        StringBuilder sb = new StringBuilder();
        double total = 0;
        for(Order x : receipt){
            sb.append(x.getName()+"\t Php "+x.getPrice()+"\n");
            total+= x.getPrice();
        }
        sb.append("Total Price: Php "+total);
        System.out.println(sb.toString());
        return sb.toString();
    }
}
