public class Invoice{
    private int invoice_ID;
    private double invoice_price;
    private double tax;
    private double registry_price;
    private Customer customer;
    private Vehicle vehicle;
    private TVehicle tvehicle;
    private Saleperson saleperson;

    public Invoice(int invoice_ID, double invoice_price, double tax, double registry_price, Customer customer, Vehicle vehicle, TVehicle tvehicle, Saleperson saleperson) {
        this.invoice_ID = invoice_ID;
        this.invoice_price = invoice_price;
        this.tax = tax;
        this.registry_price = registry_price;
        this.customer = customer;
        this.vehicle = vehicle;
        this.tvehicle = tvehicle;
        this.saleperson = saleperson;
    }
}