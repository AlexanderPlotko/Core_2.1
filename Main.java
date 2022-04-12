package rabotaSChislami;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList2 = new ArrayList<>();

        for (int list : intList)
            if (list > 0 && (list % 2 == 0)) {
                intList2.add(list);
            }
        Collections.sort(intList2); //сортируем
        for (int list : intList2)
            System.out.println(list);
    }
}
