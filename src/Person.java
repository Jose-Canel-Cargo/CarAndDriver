public class Person {
    // User input will be compared to these so that //
    // their stick shift ability can be set in the if statement below //
    private final static int stickShiftYes = 1;
    private final static int stickShiftNo = 2;

    // Declaring the private variables that will be asked of the user // 
    private String name;
    private int age;
    private double height;
    private String driveStickShift;

    // Constructor for the Person Class //
    public Person(){

    }

    // Getter and setter methods of the Person Class //
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }

    public String getDriveStickShift(){
        return driveStickShift;
    }

    public void setName(String inputName){
        name = inputName;
    }

    public void setAge(int inputAge){
        age = inputAge;
    }

    public void setHeight(double inputHeight){
        height = inputHeight;
    }

    // For simplicity, the user is asked to enter 1 for yes and 2 for no //
    // when asked if the driver can use stick shift. The If statement then //
    // compares the input to the two variables and sets it to Yes or No //
    public void setDriveStickShift(int inputStickShift){
        if(inputStickShift == stickShiftYes){
            driveStickShift = "Yes";

        } else if(inputStickShift == stickShiftNo){
            driveStickShift = "No";
        }
    }

    // Prints the information of the Person object //
    public String toString(){

        return "\nDriver Name: " + name + "\nDriver Age: " + age + "\nDriver Height: " + height + " inches" + "\nCan Drive Stick Shift: " + driveStickShift + "\n";
    }
}
