package entities;
import entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class order {
    private static final DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private LocalDateTime moment;
    private OrderStatus status;

    private client NEW;
    private List<OrderItem> ORDER_ITEM = new ArrayList<>();

    public order(LocalDateTime moment, OrderStatus status, client nEW) {
        this.moment = moment;
        this.status = status;
        NEW = nEW;
    }
    public LocalDateTime getMoment() {
        return moment;
    }
    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public client getNEW() {
        return NEW;
    }

    public void AddOrderItem(OrderItem novo){
        ORDER_ITEM.add(novo);
    }

    public void removeOrderItem(OrderItem novo){
        ORDER_ITEM.remove(novo);
    }

    public Double total(){
        Double sum = 0.0;

        for (OrderItem o :  ORDER_ITEM){
            sum += o.subTotal();
        } 
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(fmt2.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(NEW + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : ORDER_ITEM) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
    
    

