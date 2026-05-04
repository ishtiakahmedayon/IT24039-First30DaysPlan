class Book{
    //private variables
    private String name;
    private String writer;

    //public constructor to acces the variables
    public Book(String name, String writer){
        this.name = name;
        this.writer = writer;
    }

    //public method to display book info
    public void displayInfo(){
        System.out.println("Book name: " + name);
        System.out.println("Book author: " + writer);
    }
}

public class Example2{
    public static void main(String[] args){
        Book b = new Book("Adventures of Tom Sawyer", "Mark Twen");

        b.displayInfo();
    }
}