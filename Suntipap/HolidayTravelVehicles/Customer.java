public class Customer{
    private int customer_ID;
    private String name;
    private String surname;
    private int phone;
    private String address;

    public Customer(int customer_ID,String name, String surname, int phone, String address) {
        this.customer_ID = customer_ID;
        this.name = name; 
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }
    public int negotiation(int price){
        return price;
    }

    public String approve(){
        String signature = this.name + "Approved";
        return signature;
    }
}