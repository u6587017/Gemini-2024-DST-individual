public class main {
    public static void main(String[] args) {
        Company HTV = new Company(1,"Holiday_Travel_Vehicles",01234567);
        Vehicle RV = HTV.createVehicle(01,"Airstream basecamp","Basecamp 20",2,"Airstream",40000);
        RV.print_vehicle();
    }
}