public class TVehicle{
    private int tvehicle_ID;
    private String tvehicle_name;
    private String tvehicle_model;
    private int tvehicle_year;
    private String tmanufacturer;
    private double tvehicle_price;

    public TVehicle(int tvehicle_ID, String tvehicle_name, String tvehicle_model, int tvehicle_year, String tmanufacturer, double tvehicle_price) {
        this.tvehicle_ID = tvehicle_ID;
        this.tvehicle_name = tvehicle_name;
        this.tvehicle_model = tvehicle_model;
        this.tvehicle_year = tvehicle_year;
        this.tmanufacturer = tmanufacturer;
        this.tvehicle_price = tvehicle_price;
    }

    public void print_tvehicle(){
        System.out.println(this.tvehicle_name+" ,Model: "+this.tvehicle_model+" ,Price: "+this.tvehicle_price);
    }
}