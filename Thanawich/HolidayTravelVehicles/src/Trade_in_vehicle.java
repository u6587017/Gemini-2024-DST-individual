class Trade_in_vehicle {
    private int serial_number;
    private String model;
    private int year;
    private int cost;

    public Trade_in_vehicle(int serial_number, String model, int year, int cost){
        this.serial_number = serial_number;
        this.model = model;
        this.year = year;
        this.cost = cost;
    }

    public void DisplayInfo(){
        System.out.println("Serial Number: "+ this.serial_number+ "\n"+ "Cost: "+ this.cost);
    }
}
