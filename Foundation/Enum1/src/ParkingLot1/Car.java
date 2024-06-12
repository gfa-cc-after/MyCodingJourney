package ParkingLot1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Car {
    public static void main(String[] args) {

        ArrayList<EcarTypes> carTypes = generateRandomCarTypes(256);
        ArrayList<EcarColors> colors = generateRandomColors(256);

        printOccurrences("Number of vehicles for each type:", carTypes);
        printOccurrences("Number of vehicles for each color:", colors);

        EcarTypes mostFrequentType = findMostFrequentCarType(carTypes);
        System.out.println("\nMost frequently occurring vehicle type: " + mostFrequentType);

        EcarColors mostFrequentColor = findMostFrequentColor(colors);
        System.out.println("Most frequently occurring color: " + mostFrequentColor);
    }

    private static void printOccurrences(String message, ArrayList<?> list) {
        HashMap<Object, Integer> countMap = new HashMap<>();
        for (Object item : list) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }

        System.out.println(message);
        countMap.forEach((key, count) -> System.out.println(key + ": " + count));
    }

    private static EcarTypes findMostFrequentCarType(ArrayList<EcarTypes> carTypes) {
        return findMostFrequentEnum(carTypes);
    }

    private static EcarColors findMostFrequentColor(ArrayList<EcarColors> colors) {
        return findMostFrequentEnum(colors);
    }

    private static <T> T findMostFrequentEnum(ArrayList<T> list) {
        HashMap<T, Integer> enumCount = new HashMap<>();
        for (T item : list) {
            enumCount.put(item, enumCount.getOrDefault(item, 0) + 1);
        }

        return Collections.max(enumCount.entrySet(), HashMap.Entry.comparingByValue()).getKey();
    }

    private static ArrayList<EcarTypes> generateRandomCarTypes(int count) {
        ArrayList<EcarTypes> carTypes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carTypes.add(EcarTypes.values()[(int) (Math.random() * EcarTypes.values().length)]);
        }
        return carTypes;
    }

    private static ArrayList<EcarColors> generateRandomColors(int count) {
        ArrayList<EcarColors> colors = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            colors.add(EcarColors.values()[(int) (Math.random() * EcarColors.values().length)]);
        }
        return colors;
    }
}




