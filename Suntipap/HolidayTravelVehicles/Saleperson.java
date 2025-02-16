public class Saleperson{
    private int saleperson_ID;
    private String name;
    private String surname;
    private int phone;

    public Saleperson(int saleperson_ID,String name, String surname, int phone) {
        this.saleperson_ID = saleperson_ID;
        this.name = name; 
        this.surname = surname;
        this.phone = phone;
    }
    public int negotiation(int price){
        return price;
    }

    public String approve(){
        String signature = this.name + "Approved";
        return signature;
    }

    public Invoice createInvoiceInvoice(int invoice_ID, double invoice_price, double tax, double registry_price, Customer customer, Vehicle vehicle, TVehicle tvehicle, Saleperson saleperson) {
        return new Invoice(invoice_ID, invoice_price, tax, registry_price, customer, vehicle, tvehicle, saleperson);
    }
}