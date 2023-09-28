package weather;

public class Temperature {
    private double number;
    private TempScale scale;



    // Constructors
    public Temperature(double number) {
        this.number = number;
        this.scale = TempScale.FAHRENHEIT;
    }

    public Temperature(TempScale scale) {
        this.number = 0.0;
        this.scale = scale;
    }

    public Temperature(double number, TempScale scale) {
        this.number = number;
        this.scale = scale;
    }

    public Temperature() {
        this.number = 0.0;
        this.scale = TempScale.FAHRENHEIT;
    }

    // Getter and Setter methods
    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setScale(TempScale scale) {
        this.scale = scale;
    }

    public TempScale getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return number + " " + scale;
    }
}


