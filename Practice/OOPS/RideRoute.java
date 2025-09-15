package OOPS;


interface FareCalculator {
    double calculateFare(double distance, double baseFare);
}

abstract class vehicle {
    protected double speed;
    protected double baseFare;

    vehicle(double speed, double baseFare) {
        this.speed = speed;
        this.baseFare = baseFare;
    }

    public abstract double getFare(double distance, FareCalculator calculator);

    public abstract String getType();
}

abstract class Bike extends vehicle {
    Bike(double speed, double baseFare) {
        super(speed, baseFare);
    }
}

public class RideRoute {
    
}
