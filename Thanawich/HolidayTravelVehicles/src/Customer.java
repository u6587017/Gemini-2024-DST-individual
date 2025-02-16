class Customer {
    private int customer_id;
    private String name;
    private String address;
    
    public Customer(int customer_id, String name, String address){
        this.customer_id = customer_id;
        this.name = name;
        this.address = address;
    }

    public void sign(){
        System.out.println("Customer ID: "+ this.customer_id +"Sign: " + this.name + " Address: "+ this.address);
    }
}
