public class Company {
    private int company_ID;
    private String name;
    private int phone;

    public Company(int company_ID, String name, int phone) {
        this.company_ID = company_ID;
        this.name = name;
        this.phone = phone;
    }
    
    public Vehicle createVehicle(int vehicle_ID, String vehicle_name, String vehicle_model, int vehicle_year, String manufacturer, double vehicle_price) {
        return new Vehicle(vehicle_ID, vehicle_name, vehicle_model, vehicle_year, manufacturer, vehicle_price, this.name);
    }
}
