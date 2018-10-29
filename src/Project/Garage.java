package Project;
import Project.Vehicles.Properties.*;

public interface Garage {
    String[] getAll();
    Model getModel();
    Year getYear();
    Brand getBrand();
    Color getColor();
}