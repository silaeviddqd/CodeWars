package com.isilaev;

import java.util.Arrays;

public class PangramChecker {
    private boolean isPangram(String sentence) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        return Arrays.stream(letters.split(""))
                .dropWhile(s -> sentence.toLowerCase().contains(s)).findAny().isEmpty();
    }

    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        boolean pangram = pangramChecker.isPangram("kdywxair oecglht bpmvuf nzqsj");
        System.out.println(pangram);
    }
}
