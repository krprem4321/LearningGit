package data;

import java.util.Scanner;

public class TruckLorry extends Vehicle {

    private static TruckLorry truckLorry;


    public static TruckLorry getBike() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Bike Type Vehicle");
        if (truckLorry != null) {
            System.out.println("Enter bike color : ");
            String color = sc.next();
            System.out.println("Enter bike brand : ");
            String brand = sc.next();
            System.out.println("Enter bike type : ");
            String type = sc.next();
            System.out.println("Enter bike regId : ");
            String regId = sc.next();

            truckLorry.setColor(color);
            truckLorry.setBrand(brand);
            truckLorry.setRegId(regId);
            truckLorry.setType(type);
        } else {
            truckLorry = new TruckLorry();
        }
// Close the Scanner resource
        sc.close();
        return truckLorry;
    }
}
