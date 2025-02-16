class Saleperson {
    private int employee_id;
    private String name;
    private Sales_invoice sales_invoice;

    public Saleperson(int employee_id, String name, Sales_invoice sales_invoice){
        this.employee_id = employee_id;
        this.name = name;
        this.sales_invoice =sales_invoice;
    }

    public void create_sales_invoice(){
        this.sales_invoice.DisplayInfo();
    }
}
