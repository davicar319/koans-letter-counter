package com.aceprogramming.koans.letter.counter;

import java.util.HashMap;
import java.util.Map;

final class LetterCounterRefinement2 implements LetterCounter{
    LetterCounterRefinement2() {
    }

    public Map<Character, Integer> countUsage(String inputString) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            result.compute(c, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
