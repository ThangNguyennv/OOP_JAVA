public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }
    
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.price = price;
        this.authors = authors;
        this.qty = qty;
    }
    
    public String getName() {
        return name;
    }
    
    public Author[] getAuthors() {
        return authors;
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
        for(int i = 0; i < authors.length; i++) {
            authorNames += authors[i].toString();
            if(i < authors.length-1) {
                authorNames += ",";
            }
        }
        
        return "Book[name=" + this.name + ",author={" + authorNames + "},price=" + this.price + ",qty=" + this.qty + "]";
    }
    
    public String getAuthorNames() {
        String authorNames = "";
        for(int i = 0; i < authors.length; i++) {
            authorNames += authors[i].getName();
            if(i < authors.length-1) {
                authorNames += ",";
            }
        }
        return authorNames;
    }
}