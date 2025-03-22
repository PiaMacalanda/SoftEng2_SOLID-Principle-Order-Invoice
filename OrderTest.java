public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order(
                new StandardOrderCalculator(),
                new StandardOrderProcessor(),
                new PDFInvoiceGenerator(),
                new EmailNotificationService()
        );

        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("johndoe@example.com");
    }
}