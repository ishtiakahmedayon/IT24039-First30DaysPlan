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