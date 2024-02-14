//HAHMED 2/13/2024 exercise 4

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> cityTemperatures = new HashMap<>();
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>(5);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cities, one per line, until you enter 'END':");

        String city = input.nextLine();


        while (!(city.equals("END"))) {
            cities.add(city);
            System.out.println("Enter the city name, one per line, until you enter 'END':");
            city = input.nextLine();
        }

        for (String citynames : cities) {
            System.out.println("Enter the temperature for the cities");
            for (int i = 0; i < 5;  i++) {


            }
            temperatures.add(input.nextDouble());
            System.out.println(temperatures);

        }
        System.out.println(cityTemperatures);
    }


        }




