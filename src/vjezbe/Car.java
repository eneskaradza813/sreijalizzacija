package vjezbe;

public class Car {

     String make;
    String model;
    int numDoors;
    
    static int wheels = 4;
    Car(String make, String model){
        this.make = make;
        this.model = model;
    }
    Car(String make, String model, int nDoors){
        this.make =  make;
        this.model = model;
        nDoors = numDoors;
    }
    
        void printDetails(){
            System.out.println("Make = " + make);
            System.out.println("Model = " + model);
            System.out.println("Number of doors = " + numDoors);
        }
    
}
