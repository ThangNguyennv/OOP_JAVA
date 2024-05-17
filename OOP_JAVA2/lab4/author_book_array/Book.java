package lab4.author_book_array;

public class Book {
    private String name;
    private Author author[];
    private double price;
    private int qty = 0;
    
    public Book(String name, Author author[], double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    public Book(String name, Author author[], double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName() {
        return name;
    }
    
    public Author[] getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQty() {
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String toString() {
        String authorNames = "";
        for(int i = 0; i < author.length; i++) {
            authorNames += author[i].toString();
            if(i < author.length-1) {
                authorNames += ",";
            }
        }
        
        return "Book[name=" + this.name + ",author={" + authorNames + "},price=" + this.price + ",qty=" + this.qty + "]";
    }
    
    public String getAuthorNames() {
        String authorNames = "";
        for(int i = 0; i < author.length; i++) {
            authorNames += author[i].getName();
            if(i < author.length-1) {
                authorNames += ",";
            }
        }
        return authorNames;
    }
   
}