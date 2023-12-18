package designclasses;

public class Book {
    private String bookName;
    private String authorName;
    private int price;
    
    public Book(){
        System.out.println("There is no informaiton about any book.\n\n");
    }
    public Book(String bn, String an,int p){
        this.bookName = bn;
        this.authorName = an;
        this.price=p;
    }     
    // Methods //
    public void displayInfo(){
        System.out.println("Name: "+bookName);
        System.out.println("Author: "+authorName);
        System.out.println("Price: "+price);
    }
    public void stall(String s){
        System.out.println("Book stall name = "+s);
    }
    public void stallNum(int n){
        System.out.println("Book stall number = "+n);
    }
    public void stallLocation(String l){
        System.out.println("Book stall location : "+l);
    }
    public static void main(String[] args) {
        Book b1= new Book();
        Book b2= new Book("OOP","balagurusami",700);
        b2.displayInfo();
        b2.stall("Joyonti");
        b2.stallNum(32);
        b2.stallLocation("Beside DU");
    }
    
}