package com.isilaev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        AtomicInteger peopleInTheBus = new AtomicInteger();
        stops
                .stream()
                .map(array -> Arrays.stream(array).boxed().reduce((integer, integer2) -> integer - integer2).get())
                .forEach(integer -> peopleInTheBus.set(peopleInTheBus.get() + integer));

        return peopleInTheBus.get();
    }
}
