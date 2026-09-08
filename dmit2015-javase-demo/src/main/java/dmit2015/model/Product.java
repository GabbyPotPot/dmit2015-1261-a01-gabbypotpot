package dmit2015.model;

public class Product {
    private String Name;
    private double price;

    public Product(String Name, double price) {

        if (Name == null || Name.isBlank()){
            throw new IllegalArgumentException("Name is Required");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.Name = Name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithTax(){
        return price * 1.05;
    }

}
