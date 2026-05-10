### Example1:
```
class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }else{
            System.out.println("Age is not valid");
        }
    }

    public String getName(){
        return name;
    }
}

public class Example1{
    public static void main(String[] args){
        Student s1 = new Student();

        s1.setName("Ishtiak");
        s1.setAge(-5);

        System.out.println(s1.getName());
    }
}
```
### Example2:
```
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
```