package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.time.LocalTime.now;

public class Program {
    public static void main(String[] args) throws ParseException {
        //basics that make the system work
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //entering the Client.java data
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name, email, birthDate);//inserting the client data

        //entering order status and quantity of items
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order? ");
        int n = sc.nextInt(); //quantity of items

        List<Order> orders = new ArrayList<>();
        Order order = new Order(new Date(), status, new ArrayList<>(), client);
        //for to insert the items
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            double pPrice = sc.nextInt();
            System.out.print("Quantity: ");
            int pQuantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(pName, pPrice);
            OrderItem orderItem = new OrderItem(pQuantity, pPrice, product);

            order.addItem(orderItem);

            orders.add(order);

        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
        System.out.print("Order items: ");
        for (OrderItem o : order.getItems()){
            System.out.println(o.getProduct().getName() + ", $" + o.getPrice() + ", Quantity: " + o.getQuantity() + ", Subtotal: " + o.getPrice()*o.getQuantity());
        }
        System.out.println("Total price: $" + order.total());
    }
}
