package com.aceprogramming.koans.letter.counter;

import java.util.HashMap;
import java.util.Map;

final class LetterCounterRefinement1 implements LetterCounter {
    LetterCounterRefinement1() {
    }

    public Map<Character, Integer> countUsage(String inputString) {
        return inputString == null ? countLetters("") :
                countLetters(inputString);
    }

    private static Map<Character, Integer> countLetters(String inputString) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            int count = result.containsKey(c) ? result.get(c) + 1 : 1;
            result.put(c, count);
        }
        return result;
    }
}
