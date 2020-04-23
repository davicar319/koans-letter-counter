package com.aceprogramming.koans.letter.counter;

import java.util.Map;
import java.util.Objects;

final class NullSafeLetterCounter implements LetterCounter {
    private final LetterCounter letterCounter;

    NullSafeLetterCounter(final LetterCounter letterCounter) {
        this.letterCounter = Objects.requireNonNull(letterCounter, "The input letter counter cannot be null.");
    }

    @Override
    public Map<Character, Integer> countUsage(String inputString) {
        return inputString == null ? letterCounter.countUsage("")
                : letterCounter.countUsage(inputString);
    }
}