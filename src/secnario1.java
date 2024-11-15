import java.util.*;
public class secnario1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Inventory inventory=new Inventory();
        while(true){
            System.out.println("Choose an option");
            System.out.println("1.Add Product");
            System.out.println("2.Remove Product");
            System.out.println("3.Display Products");
            System.out.println("4.Display Total Inventory Value");
            System.out.println("5.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter product name:");
                    String name = sc.next();
                    System.out.println("Enter price:");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity");
                    int quantity = sc.nextInt();
                    inventory.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    System.out.println("Removed Product:");
                    String Productname = sc.next();
                    inventory.removeProduct(Productname);
                    break;
                case 3:
                    System.out.println("Product details:");
                    inventory.displayProducts();
                    break;
                case 4:
                    System.out.println("Total Inventory Value:");
                    System.out.println(inventory.getTotalInventoryValue());
                    break;
                case 5:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
class Product{
    private String name;
    private double price;
    private int quantity;
    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public double  getTotalValue(){
        return price*quantity;
    }
}
class Inventory{
    private ArrayList<Product>products;
    public Inventory(){
        products=new ArrayList<>();
    }
    public void addProduct(Product product){
        for(Product p:products) {
            if (p.getName().equalsIgnoreCase(product.getName())) {
                p.setQuantity(p.getQuantity() + product.getQuantity());
                System.out.println(product.getName());
                return;
            }
        }
        products.add(product);
        System.out.println("added product:" +product.getName());
    }
    public void removeProduct(String productName){
        for(Product p:products){
            if(p.getName().equalsIgnoreCase(productName)){
                products.remove(p);
            }
        }

    }
    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("no proucts available");
        }
        else{
            for(Product p:products){
                System.out.println(p.getName()+" "+p.getPrice()+" "+p.getQuantity());
            }
        }
    }
    public double getTotalInventoryValue(){
        double total=0;
        for(Product p:products){
            total+=p.getTotalValue();
        }
        return total;
    }

}
