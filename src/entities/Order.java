package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(){

    }

    public Order(Date moment, OrderStatus status, List<OrderItem> items, Client client) {
        this.moment = moment;
        this.status = status;
        this.items = items;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double price = 0.0;

        for (OrderItem i : items){
            price += i.getQuantity() * i.getPrice();
        }

        return price;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + getClient().getName() + " (" + sdf2.format(getClient().getBirthDate()) + ") - " + getClient().getEmail() + "\n");
        return sb.toString();
    }
}
