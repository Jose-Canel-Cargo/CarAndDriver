public class Car {

    // Initialized variables to be used in the If statement of the setTransmission method //
    private final static int carTransmissionStick = 1;
    private final static int carTransmissionAutomatic = 2;

    // Declaring variables for each of the Car objects that will be created //
    private String make;
    private String model;
    private int year;
    private String color;
    private double headroom;
    private String transmission;

    // Initializes the warnings that will display if there is a problem //
    // with the height or transmission ability of the driver assigned //
    private String headroomWarning = "Warning: Driver is too tall for this car!";
    private String transmissionWarning = "Warning: Driver is assigned to a manual transmission car without the skill to drive it!";

    // Constructor method for the Car Class //
    public Car(){

    }

    // Overloaded constructor method for the Car Class //
    public Car(String inputMake, String inputModel, int inputYear, String inputColor, double inputHeadroom, int inputTransmission){
        setMake(inputMake);
        setModel(inputModel);
        setYear(inputYear);
        setColor(inputColor);
        setHeadroom(inputHeadroom);
        setTransmission(inputTransmission);
    }

    // Getter and setter methods //
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public double getHeadroom(){
        return headroom;
    }

    public String getTransmission(){
        return transmission;
    }

    public void setMake(String inputMake){
        make = inputMake;
    }

    public void setModel(String inputModel){
        model = inputModel;
    }

    public void setColor(String inputColor){
        color = inputColor;
    }

    public void setYear(int inputYear){
        year = inputYear;
    }

    public void setHeadroom(double inputHeadroom){
        headroom = inputHeadroom;
    }

    // Setter method for the transmission that will assign Stick Shift //
    // or Automatic depending on the number provided //
    public void setTransmission(int inputTransmission){
        if(inputTransmission == carTransmissionStick){
            transmission = "Stick Shift";
        } else if(inputTransmission == carTransmissionAutomatic){
            transmission = "Automatic";
        }
    }

    // Method to display the properties of the Car object //
    public String toString(){
        return "\nCar Make: " + make + "\nCar Model: " + model + "\nCar Year: " + year + "\nCar Color: " + color + "\nCar Headroom: " + headroom + " inches" + "\nCar Transmission: " + transmission + "\n"; 
    }

    // Method to display the properties of the Car object, the driver assigned //
    // and checks if the driver is too tall or was assigned to a Stick Shift car //
    // without being able to drive it. If a mismatch is detected the proper warning will //
    // be displayed alongside the information for the car and driver assigned to it //
    public String carToString(Person carDriver){

        Person driver = carDriver;
        double driverHeight = driver.getHeight() / 2;
        String driverTransmission = driver.getDriveStickShift();

        if(driverTransmission == "No" && transmission == "Stick Shift"){
            return transmissionWarning + driver.toString() + toString();

        } else if(driverHeight > headroom){
            return headroomWarning + driver.toString()+ toString();
        } else{
            return driver.toString() + toString();
        }
            
    }
    
}


