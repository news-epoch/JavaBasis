package Polymorphism;

public class Traffic {
    public  void drive(){
        System.out.println("This is Traffics");
    }

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Traffic[] traffic = {car,bicycle};

        for(Traffic i : traffic){
            i.drive();
        }
        // or
//        for(int i = 0; i < traffic.length; i++){
//            traffic[i].drive();
//        }

    }
}

class Car extends Traffic{
    @Override
    public void drive() {
        System.out.println("This is Car");
    }
}
class Bicycle extends Traffic{
    @Override
    public void drive() {
        System.out.println("This is Bicycle");
    }
}
