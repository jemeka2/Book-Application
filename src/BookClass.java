
public class BookClass {
    private String bookTitle, author, desc, stock;
    private int price;

    public BookClass(){
        this.bookTitle = "";
        this.author = "";
        this.desc = "";
        this.price = 0;
    }

    public BookClass(String bookTitle, String author, String desc, String stock, int price){
        this.bookTitle = bookTitle;
        this.author = author;
        this.desc = desc;
        this.price = price;
        this.stock = stock;
    }

    public void setBookTitle(String bTitle){
        this.bookTitle = bTitle;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }


    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }


    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }


    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setStock(String stock){
        this.stock = stock;
    }
    public String getStock(){
        return stock;
    }

    public void getDisplaytext(){
        System.out.println("Author: " + this.author + "\nTitle: " + this.bookTitle + "\nDescription: " + this.desc +"\nStock: " + this.stock + "\nPrice: $" + this.price + "\n");
    }
}
