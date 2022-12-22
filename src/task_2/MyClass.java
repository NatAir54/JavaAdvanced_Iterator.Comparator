package task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Crocodile");
        list.add("Donkey");
        list.add("Goat");
        list.add("Iguana");
        list.add("Lizard");
        list.add("Snake");
        list.add(null);
        list.add("Wolf");
        list.add("Wolf");
        list.add("Zebra");

        System.out.println(list.size());

        // creating an iterator
        ListIterator<String> listItr = list.listIterator();

        while(listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }

    }
}
