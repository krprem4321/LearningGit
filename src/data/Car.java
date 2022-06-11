package data;

public class Car extends Vehicle{
   private Car car;

    public Car getCar(){
        if (car!=null){
           car.setColor("Red");
           car.setRegId("Br012345");
           car.setBrand("AudiQ7");
            car.setType("Four Wheeler");
        }else {
            car=new Car();
        }
        return car;
    }

}
