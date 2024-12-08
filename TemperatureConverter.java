import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Allows a user to choose between which unit they want to convert to or from
        System.out.println("Hello, What units would you like to convert to?");
        System.out.println("A. CELSIUS to FAHRENHEIT. ");
        System.out.println("B. FAHRENHEIT to CELSIUS. ");
        System.out.println(".....Select your conversion unit as 'A' or 'B': ....");
        String convert = input.nextLine();

        //A switch case to check the user input and its appropriate result
        switch (convert) {

            //Case A converts accept user value and converts to Fahrenheit from Celsius
            case "A":
                System.out.println("Input the value you want to be converted: ");
                double celsius = input.nextDouble();
                double convertedCelsius = toFahrenheit(celsius);
                System.out.println("The Celsius unit "+ celsius + " in Fahrenheit unit is "
                        + convertedCelsius);
                break;

            // Case B converts accepts user inputs and converts from Fahrenheit to Celsius
            case "B":
                System.out.println("Input the value you want to be converted: ");
                double fahrenheit = input.nextDouble();
                double convertedFahrenheit = toCelsius(fahrenheit);
                System.out.println("The Fahrenheit unit "+ fahrenheit + " in Celsius unit is "
                        + convertedFahrenheit);
                break;


            //Output when the user enters a wrong input
            default:
                System.out.println("Invalid input! Enter in the format 'A' or 'B': ");
        }

    }

    //method to change from Fahrenheit to Celsius
    public static double toFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    // method to change from Celsius to Fahrenheit
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32)* 0.56;
    }
}
