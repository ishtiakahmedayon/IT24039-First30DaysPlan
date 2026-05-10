### CompileTimePolymorphism

```
class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }
}


public class CompiletimePoly{
    public static void main(String[] args){
        Calculator c = new Calculator();

        System.out.println(c.add(3,5));
        System.out.println(c.add(3.5 , 8.5));
    }
}
```

### RunTimePolymorphism

```
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class RuntimePoly{
    public static void main(String[] args){
        Dog d = new Dog();

        d.sound();
    }
}
```