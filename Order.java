public class Order {
    
    private final OrderCalculator calculator;
    private final OrderProcessor processor;
    private final InvoiceGenerator invoiceGenerator;
    private final EmailService emailService;

    public Order(
            OrderCalculator calculator,
            OrderProcessor processor,
            InvoiceGenerator invoiceGenerator,
            EmailService emailService) {
        this.calculator = calculator;
        this.processor = processor;
        this.invoiceGenerator = invoiceGenerator;
        this.emailService = emailService;
    }

    public double calculateTotal(double price, int quantity) {
        return calculator.calculateTotal(price, quantity);
    }

    public void placeOrder(String customerName, String address) {
        processor.placeOrder(customerName, address);
    }

    public void generateInvoice(String fileName) {
        invoiceGenerator.generateInvoice(fileName);
    }

    public void sendEmailNotification(String email) {
        emailService.sendEmailNotification(email);
    }
}