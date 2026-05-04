class Student{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println (name + " " + id);
    }
}

public class Example1{
    public static void main(String[] args){
        Student s1 = new Student("Ishtiak", 23);

        s1.display();

        
    }
}