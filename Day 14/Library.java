//library management system using ArrayList

import java.util.ArrayList;

public class Library {
    private ArrayList<String> books;

    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(String book){
        books.add(book);
    }
    
    public void displayBooks(){
        System.out.println("Books in the library: ");
        for(String book : books){
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Library myLib = new Library();
        myLib.addBook("The old man and sea");
        myLib.addBook("1984");
        myLib.addBook("Aronnok");
        myLib.displayBooks();
    }
}

