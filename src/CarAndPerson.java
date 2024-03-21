// Course: COP-2805C-86399 //
// Assignment: Project 2: Demonstrate OOP principles for encapsulation //
// Date: 2/3/24 //
// Name: Jose A. Canellas Torres //

import java.util.Scanner;
public class CarAndPerson {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Prints the information of the developer and the class //
        System.out.println("\n**Course: COP-2805C-86399**\n**Assignment: Project 2: Demonstrate OOP principles for encapsulation**\n**Date: 2/3/24**\n**Name: Jose A. Canellas Torres**\n");
        
        // Creating the first two car objects using overloaded constructor methods //
        Car firstCar = new Car("Audi", "Q4 E-tron", 2022, "Blue", 38.5, 2);
        Car secondCar = new Car("Honda", "Acura Integra", 2023, "Gray", 37.6, 1);

        // Creating the third and final Car object by using set methods to demonstrate that they work //
        Car thirdCar = new Car();
        thirdCar.setMake("Chevrolet");
        thirdCar.setModel("Bolt EV 1LT");
        thirdCar.setYear(2023);
        thirdCar.setColor("Red");
        thirdCar.setHeadroom(40.1);

        // The set method for the Car class uses an if statement where if 1 is sent as an argument transmission will be set to "Stick Shift" and 2 will set it to "Automatic" //
        // This is in the case the user must input the car's transmission //
        thirdCar.setTransmission(1);

        // Requests input from the user for the three drivers //
        System.out.println("We have three cars available at the moment, please input the information for 3 drivers\n");

        // Creates the three Person objects that will then be assigned to a Car object //
        Person firstDriver = new Person();
        Person secondDriver = new Person();
        Person thirdDriver = new Person();

        // Requests name for the first driver's name and sets //
        // the entered name for the first Person object //
        System.out.println("\nFirst driver's name?: ");
        String firstDriverName = input.next();
        firstDriver.setName(firstDriverName);

        // Requests the age of the first driver and sets //
        // the entered age for the first Person object //
        System.out.println("\nFirst driver's age?: ");
        int firstDriverAge = input.nextInt();
        firstDriver.setAge(firstDriverAge);

        // Requests the driver's height in inches and sets //
        // the entered height for the first Person object //
        System.out.println("\nFirst driver's height?(Please input height in inches): ");
        double firstDriverHeight = input.nextDouble();
        firstDriver.setHeight(firstDriverHeight);

        // Request the driver's stick shift driving ability //
        // as 1 for yes or 2 for no so that it can be checked //
        // in the If statement inside the method //
        System.out.println("\nCan they drive Stick Shift?(Please enter 1 for yes or 2 for no): ");
        int firstDriverStickShiftAbility = input.nextInt();
        firstDriver.setDriveStickShift(firstDriverStickShiftAbility);


        // The same process above repeats but for the second Person object //
        System.out.println("\nSecond driver's name?: ");
        String secondDriverName = input.next();
        input.nextLine();
        secondDriver.setName(secondDriverName);

        System.out.println("\nSecond driver's age?: ");
        int secondDriverAge = input.nextInt();
        secondDriver.setAge(secondDriverAge);

        System.out.println("\nSecond driver's height?(Please input height in inches): ");
        double secondDriverHeight = input.nextDouble();
        secondDriver.setHeight(secondDriverHeight);

        System.out.println("\nCan they drive Stick Shift?(Please enter 1 for yes or 2 for no): ");
        int secondDriverStickShiftAbility = input.nextInt();
        secondDriver.setDriveStickShift(secondDriverStickShiftAbility);

        // The same process for the first and second Person objects repeats //
        System.out.println("\nThird driver's name?: ");
        String thirdDriverName = input.next();
        input.nextLine();
        thirdDriver.setName(thirdDriverName);

        System.out.println("\nThird driver's age?: ");
        int thirdDriverAge = input.nextInt();
        thirdDriver.setAge(thirdDriverAge);

        System.out.println("\nThird driver's height?(Please input height in inches)");
        double thirdDriverHeight = input.nextDouble();
        thirdDriver.setHeight(thirdDriverHeight);

        System.out.println("\nCan they drive Stick Shift?(Please enter 1 for yes or 2 for no): ");
        int thirdDriverStickShiftAbility = input.nextInt();
        thirdDriver.setDriveStickShift(thirdDriverStickShiftAbility);

        // Closes input //
        input.close();

        // Prints out the information for the three Person objects and their assigned //
        // Car object. If any Person is either to tall or can't drive stick shift //
        // and was assigned to a stick shift car the proper warning will be displayed //
        System.out.println("\nHere are all the drivers and their assigned cars: ");
        System.out.println(firstCar.carToString(firstDriver));
        System.out.println(secondCar.carToString(secondDriver));
        System.out.println(thirdCar.carToString(thirdDriver));

        
    }
}

