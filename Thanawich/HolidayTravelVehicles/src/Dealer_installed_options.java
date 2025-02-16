class Dealer_installed_options {
    private int[] option_code;
    private String description;
    private int price;

    public Dealer_installed_options(int[] option_code, String description, int price){
        this.option_code = option_code;
        this.description = description;
        this.price = price;
    }

    public void display_installed_option(){
        System.out.println("Options: "+ this.description + " Price: "+this.price);
    }
}
