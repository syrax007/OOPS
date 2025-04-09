
class Publisher {
    String publisherName;
    String publisherAddress;
    public Publisher(String publisherName, String publisherAddress) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
    }
}


class Book extends Publisher {
    String bookTitle;
    String author;
    double price;

  
    public Book(String publisherName, String publisherAddress, String bookTitle, String author, double price) {
        super(publisherName, publisherAddress); 
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher Address: " + publisherAddress);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


class Literature extends Book {
    String genre;

  
    public Literature(String publisherName, String publisherAddress, String bookTitle, String author, double price, String genre) {
        super(publisherName, publisherAddress, bookTitle, author, price);
        this.genre = genre;
    }

   
    @Override
    public void display() {
        super.display();
        System.out.println("Genre: " + genre);
        System.out.println("Category: Literature");
    }
}


class Fiction extends Book {
    String subGenre;

   
    public Fiction(String publisherName, String publisherAddress, String bookTitle, String author, double price, String subGenre) {
        super(publisherName, publisherAddress, bookTitle, author, price); 
        this.subGenre = subGenre;
    }

    
    @Override
    public void display() {
        super.display();
        System.out.println("Sub-Genre: " + subGenre);
        System.out.println("Category: Fiction");
    }
}


public class BookDemo{
    public static void main(String[] args) {
       
        Literature literatureBook = new Literature("Oxford Publishing", "10 Main Street", "The Great Gatsby", "F. Scott Fitzgerald", 15.99, "Classic");

        
        Fiction fictionBook = new Fiction("Random House", "15 Park Avenue", "The Hobbit", "J.R.R. Tolkien", 12.50, "Fantasy");

      
        System.out.println("--- Literature Book Details ---");
        literatureBook.display();

        System.out.println("\n--- Fiction Book Details ---");
        fictionBook.display();
    }
}

