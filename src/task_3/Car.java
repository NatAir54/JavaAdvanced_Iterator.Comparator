package task_3;

import java.util.Comparator;

public class Car{
    private int speed;
    private int price;
    private String model;
    private String color;


    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{" + speed +
                " km/hr, " + price +
                " USD, '" + model +
                "', " + color +
                '}';
    }

}

class carComparator implements Comparator <Car>{
    public int compare(Car carFirst, Car carSecond) {
        int temp1 = (carFirst.getSpeed() - carSecond.getSpeed());
        int temp2 = (carFirst.getPrice() - carSecond.getPrice());
        int temp3 = (carFirst.getModel().compareTo(carSecond.getModel()));

        if (temp1 == 0) {
            if (temp2 == 0) {
                if (temp3 == 0) { return (carFirst.getColor().compareTo(carSecond.getColor())); }
                return temp3;
            }
            return temp2;
        }
        return temp1;
    }
}



