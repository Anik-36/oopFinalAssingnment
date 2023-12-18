package designclasses;

public class Product {
    private String productName;
    private String companyName;
    private int price;
    //constructor  1
    public Product(){
        System.out.println("No product in here. \n\n");
    }
    public Product(String p,String c, int a){
        this.productName=p;
        this.companyName=c;
        this.price=a;
    }
    public void displayInfo(){
        System.out.println("Product name = "+productName);
        System.out.println("Company name = "+companyName);
        System.out.println("Product price = "+price);
    }
    public void size(String s){
        System.out.println("Size = "+s);
    }
    public void quality(String q){
        System.out.println("Product Quality = "+q);
    }
    public void madeIn(String m){
        System.out.println("Made in = "+m);
    }
    public static void main(String[] args) {
        Product p1= new Product();
        Product p2= new Product("Shirt","Kelvin clein",5000);
        p2.displayInfo();
        p2.size("M");
        p2.quality("Good");
        p2.madeIn("Bangladesh");
        
    }
}
