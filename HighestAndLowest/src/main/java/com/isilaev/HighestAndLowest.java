package com.isilaev;

import java.util.Arrays;
import java.util.Comparator;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        Object[] array = Arrays.stream(
                        numbers.split(" "))
                .map(Integer::valueOf)
                .sorted(Comparator.comparingInt(o -> o))
                .distinct()
                .toArray();

        return array[array.length - 1].toString().concat(" ").concat(array[0].toString());
    }
}
