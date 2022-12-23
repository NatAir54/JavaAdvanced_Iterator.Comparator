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

class carComparator implements Comparator {
    public int compare(Object objectFirst, Object objectSecond) {
        int temp1 = ((Car)objectFirst).getSpeed() - ((Car)objectSecond).getSpeed();
        int temp2 = ((Car)objectFirst).getPrice() - ((Car)objectSecond).getPrice();
        int temp3 = ((Car)objectFirst).getModel().compareTo(((Car)objectSecond).getModel());

        if (temp1 == 0) {
            if (temp2 == 0) {
                if (temp3 == 0) { return ((Car)objectFirst).getColor().compareTo(((Car)objectSecond).getColor()); }
                return temp3;
            }
            return temp2;
        }
        return temp1;
    }
}



