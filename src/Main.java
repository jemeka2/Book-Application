public class Main {
    public static void main(String[] args){
        BookClass book1 = new BookClass();
        BookClass book2 = new BookClass();
        //Wanted to use all methods for adding value to the methods
        BookClass book3 = new BookClass("One Piece", "Eiichiro Oda","One Piece is a manga about a pirate named Luffy who travels on a journey to become the king of the pirates.", "Available", 12);

        //Adding value to each book variable
        book1.setBookTitle("Tokyo Ghoul");
        book2.setBookTitle("Hunter X Hunter");

        book1.setAuthor("Sui Ishida");
        book2.setAuthor("Yoshihiro Togashi");

        book1.setDesc("Tokyo Ghoul is manga about a college student named Ken Kaneki who has his world flipped upside down when he becomes a ghoul, humanities worst nightmare.");
        book2.setDesc("Hunter X Hunter is a manga about a young boy named Gon Freecs who is goes on a journey to become a strong hunter so he can find his father.");

        book1.setPrice(12);
        book2.setPrice(12);

        book1.setStock("Available");
        book2.setStock("Sold Out");


        //I did this because the get methods weren't being used otherwise
        System.out.println("Author: " + book1.getAuthor() + "\nTitle: " + book1.getBookTitle() + "\nDescription: " + book1.getDesc() + "\nStock: " + book1.getStock() + "\nPrice: $" + book1.getPrice() + "\n");
        book2.getDisplaytext();
        book3.getDisplaytext();

    }
}
