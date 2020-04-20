package com.aceprogramming.koans.letter.counter;

import java.util.Map;

public interface LetterCounter {
    Map<Character, Integer> countUsage(String inputString);
}
