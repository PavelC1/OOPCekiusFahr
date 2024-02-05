package Sarcina1_2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TempConverter obj = new TempConverter();
        // varianta din ex1
        // double Temperature=100;
        // double conversionC= obj.convertToFahr(Temperature);
        // double conversionF= obj.convertToCelsius(Temperature);


        // varianta din ex2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti temperatura in Celsius: ");
        double TemperatureCelsius = scanner.nextDouble();
        double ResultCelsius= obj.convertToFahr(TemperatureCelsius);
        System.out.println(TemperatureCelsius+ "Celsius ="+ ResultCelsius +"Fahr");

        System.out.print("Introduceti temperatura in Fahr: ");
        double TemperatureFahr = scanner.nextDouble();
        double ResultFahr= obj.convertToCelsius(TemperatureFahr);
        System.out.println(TemperatureFahr+ "Farh ="+ ResultFahr +"Celsius");
    }
}
