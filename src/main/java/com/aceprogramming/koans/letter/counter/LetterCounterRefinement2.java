package com.aceprogramming.koans.letter.counter;

import java.util.HashMap;
import java.util.Map;

public class LetterCounterRefinement2 {
    LetterCounterRefinement2() {
    }

    public Map<Character, Integer> countUsage(String inputString) {
        return inputString == null ? countLetters("") :
                countLetters(inputString);
    }

    private static Map<Character, Integer> countLetters(String inputString) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            result.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
