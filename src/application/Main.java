package application;

import entities.CarModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<CarModel> cars = new ArrayList<>();
        System.out.println("How many cars do you want to register?");
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println("Car #" + (i + 1));
            System.out.print("Car ID: ");
            Integer carID = scanner.nextInt();
            System.out.print("Car License Plate: ");
            String carLicense = scanner.next();
            System.out.print("Car kilometer: ");
            Double carKilometer = scanner.nextDouble();
            System.out.print("Car brand: ");
            String carBrand = scanner.next();
            System.out.print("Car model: ");
            String carModel = scanner.next();
            System.out.print("Car color: ");
            String carColor = scanner.next();
            System.out.print("Car year: ");
            Integer carYear = scanner.nextInt();
            CarModel car = new CarModel(carID, carLicense, carKilometer, carBrand, carModel, carColor, carYear);
            System.out.println("Car Registered: " + car.toString());
            cars.add(car);
        }
        System.out.println("--------Registered cars--------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.printf("#%d - %s%n", (i+1), cars.get(i).toString());
        }
        System.out.println("Which car do you want to sell? ");
        int sellCarId = scanner.nextInt();
        CarModel sellingCar = cars.stream().filter(x -> x.getCarID() == sellCarId).findFirst().orElse(null);
        if (sellingCar != null) {
            sellCar(cars, sellingCar.getCarID());
        } else {
            System.out.println("This car doesn't exist!");
        }
        System.out.println("--------Remaining cars--------");
        /*
        for (CarModel eachCar : cars ){
            System.out.printf(cars.toString());
        }
         */
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }
    }

    public static void sellCar(List<CarModel> car, Integer id){
        for (int i = 0; i < car.size(); i++) {
            if (car.get(i).getCarID() == id){
                System.out.println("Car sold: " + car.get(i).toString());
                car.remove(i);
            }
        }
    }
}
