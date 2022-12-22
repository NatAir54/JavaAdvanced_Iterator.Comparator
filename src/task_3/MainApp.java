package task_3;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Car car1 = new Car(200, 30000, "Mercedes-Benz", "green");
        Car car2 = new Car(200, 30000, "Mercedes-Benz", "black");
        Car car3 = new Car(190, 25000, "Audi", "grey");
        Car car4 = new Car(190,20000, "Jeep", "red");

        Car[] carPark = {car1, car2, car3, car4};

        Arrays.sort(carPark, new carComparator());

        for (Car temp : carPark) {
            System.out.println(temp);
        }

    }
}
