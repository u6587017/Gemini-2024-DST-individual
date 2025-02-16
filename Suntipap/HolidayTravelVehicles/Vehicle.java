public class Vehicle{
    private int vehicle_ID;
    private String vehicle_name;
    private String vehicle_model;
    private int vehicle_year;
    private String manufacturer;
    private double vehicle_price;
    private String company;

    public Vehicle(int vehicle_ID, String vehicle_name, String vehicle_model, int vehicle_year, String manufacturer, double vehicle_price, String company) {
        this.vehicle_ID = vehicle_ID;
        this.vehicle_name = vehicle_name;
        this.vehicle_model = vehicle_model;
        this.vehicle_year = vehicle_year;
        this.manufacturer = manufacturer;
        this.vehicle_price = vehicle_price;
        this.company = company;
    }

    public void print_vehicle(){
        System.out.println(this.vehicle_name+" ,Model: "+this.vehicle_model+" ,Price: "+this.vehicle_price);
    }
}