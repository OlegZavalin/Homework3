package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MyClass {
    public static void main(String[] args) {
        int g;
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Сore");
        arr.add("Neck");
        arr.add("Chest");
        arr.add("Shoulders");
        arr.add("Biceps");
        arr.add("Abdominals");
        arr.add("Waist");
        arr.add("Calves");
        arr.add("Hips");
        arr.add("Forearms");
        arr.add("Butt");
        arr.add("Hips");
        arr.add("Triceps");
        arr.add("Shoulders");
        arr.add("Chest");
        arr.add("Biceps");
        arr.add("Waist");
        arr.add("Shoulders");
        arr.add("Biceps");
        arr.add("Biceps");

        for (int i = 0; i < arr.size(); i++) {
            g = 0;

            for (int j = 0; j < arr.size(); j++) {

                if (arr.get(i).equals(arr.get(j)) && i != j) {
                    g++;
                    System.out.println(arr.get(i) + " встречается: " + (g + 1) + " раз!");
                    j--;
                    arr.remove(i);
                }
            }

            }
        System.out.println("Список уникальных слов: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}


