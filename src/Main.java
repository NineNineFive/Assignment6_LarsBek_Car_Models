import Project.*;
import Project.Vehicles.*;

public class Main {
    /***
           Made by Lars Morten Bek - Assignment 6 (Car Class and Car Objects)
    ***/
    public static void main(String[] args) {
        Garage[] garage = new Garage[]{
                new Car("Citroën", "Hy", "Green", 1971),
                new Car("Citroën", "2CV Charleston", "Grey", 1986),
                new Car("Volkswagen", "Bobbel", "Blue", 1957),
                new Car("Volkswagen", "Camper", "Red", 1966),
                new Bike("Lars Morten Bek","Harley-Davidson","Hummer","White",1955)
        };

        // Change a property
        garage[4].getColor().setName("Orange"); // Painting my bike from white to orange :-)

        // For each Project.Vehicle
        for(int i = 0; i < garage.length; i++) {
            // Print each property (type, brand, model, etc)
            for(int j = 0; j < garage[i].getAll().length; j++){
                System.out.println(garage[i].getAll()[j]);
            }
            System.out.println();
        }
    }
}
