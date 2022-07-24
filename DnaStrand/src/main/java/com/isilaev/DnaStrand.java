package com.isilaev;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DnaStrand {
    public static String makeComplement(String dna) {
        return Arrays.stream(dna.split("")).map(DnaStrand::replace).collect(Collectors.joining());
    }

    private static String replace(String dna) {
        return switch (dna) {
            case "A" -> "T";
            case "T" -> "A";
            case "C" -> "G";
            case "G" -> "C";
            default -> dna;
        };
    }
}