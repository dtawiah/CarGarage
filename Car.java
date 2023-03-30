import java.util.Scanner;
public class Car {
    //Constants
    private final String make = "Hyundai";
    private final String model = "Sonata";
    private final int year = 2023;
    private final double fuelTankSize = 20.0;
    private final double fuelEconomy = 30.0;
    private final double speed = 50.0;



    //Other fields
    private int odometer;
    private int tripOdometer;
    private String color;
    private double fuelLevel;

    //Constructors
    public Car(){

    }

    public Car(String iniMake, String iniModel, int iniYear, double iniTankSize,
               double iniFuelEconomy, double iniBestSpeed) {


    }

    //Methods

    public double addFuelToTank(double gallons) { // 30
//        double currentFuelLevel = fuelLevel;      // 0
//        double fullFuelLevel = fuelTankSize - currentFuelLevel;  //20 - 0 = 20
//        double overflowLevel = fullFuelLevel - fuelTankSize;  //20 - 20 = 0
//        double underflowLevel = gallons - fullFuelLevel; //  25 - 20 = 5
        double currentLevel = fuelLevel; // 0
        double maxPossible = fuelTankSize - currentLevel; // 20
        double difference = gallons - maxPossible;
        boolean isOverflow = difference >= 0;
        double xyz = fuelTankSize - fuelLevel;

        if (difference == 0) {
            fuelLevel += gallons;
            System.out.println("The tank is full");
            return difference;
        }

        if (isOverflow) {
            fuelLevel = maxPossible;
            System.out.println("The tank is full and you have " + difference + " left in the can.");
        }
        else {
            fuelLevel += gallons;
            System.out.println("The tank is not full and can take " + xyz + " more gallons of fuel");
        }

        return difference;
    }

    public String toString() {
        String retString = "Make: " + make + "\n";
        retString += "Model: " + model + "\n";
        retString += "Year: " + year + "\n";
        retString += "Fuel Tank Size: " + fuelTankSize + "\n";
        retString += "Color: " + color + "\n";
        return retString;
    }

    public boolean equals(Car pCarObject) {
        return true;
    }

    public boolean driveCar() {
        double gallon = 1;
        double fuelBurned;
        Scanner scnr = new Scanner(System.in);
        System.out.print("How far are you traveling? ");
        int distance = scnr.nextInt();
        System.out.println("What is your cars average fuel consumption in mpg? " +
                "(must be between 20 and 30)");
        int aveMiles = scnr.nextInt();
        System.out.println("What is your speed between 0 and 80? ");
        int speed = scnr.nextInt();

        double fuelConsumption = (distance /aveMiles) * gallon;

        if (speed >= 55 && speed <= 0) {
            fuelBurned = fuelLevel - fuelConsumption;
        }
        if (55 > speed && speed = 60){
            fuelConsumption *= (3/100);
        }


//        double distance;
//        double speed;
//        double fuelBurned;
//        double drivingDistance = fuelLevel * fuelEconomy;
//        if (distance <= drivingDistance) {
//            odometer += distance;
//            tripOdometer += distance;
//            fuelBurned = distance / fuelEconomy;
//            fuelLevel = fuelBurned;
//            return true;

//
//        odometer += drivingDistance;
//        tripOdometer += drivingDistance;
//        fuelLevel = 0.0;
//        return false;
    }

    public double getTripOdometer() {
        return tripOdometer;
    }

    public void clearTripOdometer() {
        double mileage = 0.0;
    }

    public double getOdometer() {
        double mileage = (odometer * 10) /10.0;
        return mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getFuelTankSize() {
        return fuelTankSize;

    }

    public void setUpTrip(double distance, double speed){

    }




}

