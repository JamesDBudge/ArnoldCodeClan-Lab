package Car;

public abstract class Car {

    String make;
    String model;
    double price;
    String colour;
    String engine;

    public Car(String make, String model, double price, String colour, String engine) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getEngine() {
        return engine;
    }

}
