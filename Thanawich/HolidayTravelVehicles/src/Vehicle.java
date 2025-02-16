class Vehicle {
    private int serial_number;
    private String name;
    private String model;
    private String manufacturer;
    private int cost;

    public Vehicle(int serial_number, String name, String model, String manufacturer, int cost){
        this.serial_number = serial_number;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    public void getInfo() {
        System.out.println("Vehicle Info:\n" +
               "Serial Number: " + serial_number + "\n" +
               "Name: " + name + "\n" +
               "Model: " + model + "\n" +
               "Manufacturer: " + manufacturer + "\n" +
               "Cost: " + cost);
    }
}