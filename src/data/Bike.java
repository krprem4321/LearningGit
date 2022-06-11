package data;

import java.util.Scanner;

public class Bike extends Vehicle {
    private static Bike bike;


    public static Bike getBike() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Bike Type Vehicle");
        if (bike != null) {
            System.out.println("Enter bike color : ");
            String color = sc.next();
            System.out.println("Enter bike brand : ");
            String brand = sc.next();
            System.out.println("Enter bike type : ");
            String type = sc.next();
            System.out.println("Enter bike regId : ");
            String regId = sc.next();

            bike.setColor(color);
            bike.setBrand(brand);
            bike.setRegId(regId);
            bike.setType(type);
        } else {
            bike = new Bike();
        }

        sc.close();
        return bike;
    }
}
