/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectandclass;
import java.util.Scanner;
   import java.util.ArrayList;
/**
 *
 * @author ThinkPad
 */
public class Processor {
     public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> myCar = new ArrayList<>();

        System.out.print("Nhap sl xe: ");
        int n = scanner.nextInt();
      scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap model: " );
            String model = scanner.nextLine();
            System.out.println("Nhap year : " );
            int year = scanner.nextInt();
            scanner.nextLine(); 

            myCar.add(new Car(model, year));
        }
        Car.displayCarList(myCar);

        scanner.close();
    }
}

      
    




