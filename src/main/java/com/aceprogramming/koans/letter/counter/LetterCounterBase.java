package com.aceprogramming.koans.letter.counter;

import java.util.HashMap;
import java.util.Map;

final class LetterCounterBase implements LetterCounter {
    LetterCounterBase() {
    }

    public Map<Character, Integer> countUsage(String inputString) {
        if(inputString == null) {
            inputString = "";
        }
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }
}
