# Order Management System

## Overview
This is a simple Java-based Order Management System that allows users to create orders, add items, and view order summaries. The system uses object-oriented programming principles to manage clients, products, orders, and order statuses.
Made it based on an exercise of a Java Course in udemy, visit it: [Java COMPLETO Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo)

## Features
- Register clients with name, email, and birth date.
- Create orders with different statuses.
- Add multiple order items with product details and quantities.
- Calculate total order price.
- Display order summary including client information, itemized order details, and total cost.

## Technologies Used
- **Java** (JDK 8 or later)
- **Collections Framework** (ArrayList)
- **Date Formatting** (SimpleDateFormat)
- **Enums** (OrderStatus)

## Project Structure
```
/src
│── application
│   ├── Program.java
│
│── entities
│   ├── Client.java
│   ├── Order.java
│   ├── OrderItem.java
│   ├── Product.java
│
│── entities/enums
│   ├── OrderStatus.java
```

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/order-management-system.git
   ```
2. Open the project in an IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code with Java Extension).
3. Compile and run the `Program.java` file.
4. Follow the on-screen prompts to enter client and order details.

## Example Usage
```
Enter client data:
Name: John Doe
Email: johndoe@example.com
Birth date (DD/MM/YYYY): 15/05/1985

Enter order data:
Status: PROCESSING
How many items to this order? 2

Enter #1 item data:
Product name: Laptop
Product price: 1200.00
Quantity: 1

Enter #2 item data:
Product name: Mouse
Product price: 25.00
Quantity: 2

ORDER SUMMARY:
Order moment: 20/02/2025 14:30:45
Order status: PROCESSING
Client: John Doe (15/05/1985) - johndoe@example.com
Order items:
Laptop, $1200.00, Quantity: 1, Subtotal: $1200.00
Mouse, $25.00, Quantity: 2, Subtotal: $50.00
Total price: $1250.00
```
## License
This project is open-source and available under the [MIT License](LICENSE).

