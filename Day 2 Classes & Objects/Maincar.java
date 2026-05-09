class Car{
    String model;
    String brand;

    public Car(String model, String brand){
        this.model = model;
        this.brand = brand;
    }

    public void displayInfo(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
    }
}

public class Maincar{
    public static void main(String[] args){
        Car c = new Car("Prius", "Toyota");
        c.displayInfo();
    }
}