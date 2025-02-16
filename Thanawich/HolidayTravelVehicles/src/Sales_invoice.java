class Sales_invoice {
    private Customer customer;
    private Trade_in_vehicle trade_in_vehicle;
    private Vehicle vehicle;
    private Dealer_installed_options dealer_installed_options;
    private int tax;
    private int register_cost;

    public Sales_invoice(Customer customer, Trade_in_vehicle trade_in_vehicle, 
    Vehicle vehicle, Dealer_installed_options dealer_installed_options, int tax, int register_cost){
        this.customer = customer;
        this.trade_in_vehicle = trade_in_vehicle;
        this.vehicle = vehicle;
        this.dealer_installed_options = dealer_installed_options;
        this.tax = tax;
        this.register_cost = register_cost;
    }

    public void DisplayInfo(){
        this.customer.sign();
        this.vehicle.getInfo();
        this.trade_in_vehicle.DisplayInfo();
        this.dealer_installed_options.display_installed_option();
    }
    
}
