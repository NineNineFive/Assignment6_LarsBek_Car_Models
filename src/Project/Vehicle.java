package Project;
import Project.Vehicles.Properties.*;

public abstract class Vehicle implements Garage {
    private Brand brand;
    public Color color;
    private Year year;
    private Model model;

    public Vehicle(String brand, String model, String color, int year){
        this.brand = new Brand(brand);
        this.model = new Model(model);
        this.color = new Color(color);
        this.year = new Year(year);
    }

    public String[] getAll(){
        return new String[]{
            "Type: "+this.getClass().getSimpleName(),
            "Project.Vehicle: "+ this.getBrand().getName(),
            "Model: "+this.getModel().getName(),
            "Color: "+this.getColor().getName(),
            "Year: "+this.getYear().getTime()
        };
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public Year getYear() {
        return year;
    }

    public Brand getBrand() {
        return brand;
    }
}
