package pack1;

public class Car1 {
    String color;


    public void showColor() {
        System.out.println(color);
    }

    public static void main(String[] args) {
     int a = 5;
     Car1 car1 = new Car1();
     car1.color = "red";

     Car1 car2 = new Car1();
     car2.color = "black";

     System.out.println(car1.color);



    }
}
