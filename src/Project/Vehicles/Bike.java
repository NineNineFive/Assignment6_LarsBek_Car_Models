package Project.Vehicles;
import Project.Vehicle;

public class Bike extends Vehicle {
        private String ownerName;

        public Bike(String ownerName, String brandName, String modelName, String color, int year){
            super(brandName,modelName,color,year);
            this.ownerName = ownerName;
        }

        @Override
        public String[] getAll(){
            return new String[]{
                "Owner: "+this.ownerName,
                "Type: "+this.getClass().getSimpleName(), // lars
                "Project.Vehicle: "+ this.getBrand().getName(),
                "Model: "+super.getModel().getName(),
                "Color: "+this.getColor().getName(),
                "Year: "+this.getYear().getTime()
            };
        }
}
