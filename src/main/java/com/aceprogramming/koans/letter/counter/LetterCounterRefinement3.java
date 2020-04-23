package com.aceprogramming.koans.letter.counter;

import java.util.Map;
import java.util.stream.Collectors;

final class LetterCounterRefinement3 implements LetterCounter{
    LetterCounterRefinement3() {

    }

    @Override
    public Map<Character, Integer> countUsage(String inputString) {
        return inputString.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));

    }
}
