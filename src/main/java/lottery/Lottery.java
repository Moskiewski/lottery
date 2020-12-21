package lottery;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Lottery {
    public static void main(String[] args) {
        Set<Integer> numbersList = new LinkedHashSet<>();
        Random random = new Random();

        while (numbersList.size() < 8) {
            int x = random.nextInt(36) + 1;
            System.out.println("Picked numbers:" + " " + x);
            numbersList.add(x);
        }
        for (Integer integer : numbersList) {
            System.out.println(integer);

        }
    }
}
