package objectandclass;

import java.util.ArrayList;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayDetail() {
        System.out.println("car model: " + model + "Year: " + year);

    }

    public static void displayCarList(ArrayList<Car> myCar) {
        System.out.println("\nDanh sách xe:");
        for (Car car : myCar) {
            car.displayDetail();
        }
    }
}

   