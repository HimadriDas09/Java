package OOPS.Interfaces.MultipleInheritance;

public interface Camera {
    // abstract methods
    public abstract void takePhoto();

    public abstract void takeVideo();

    public default String getDetails() {
        return "pixels: 48";
    }
}
