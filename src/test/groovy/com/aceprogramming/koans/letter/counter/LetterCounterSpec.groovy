package com.aceprogramming.koans.letter.counter

import spock.lang.Specification
import spock.lang.Unroll


class LetterCounterSpec extends Specification {
    def letterCounters = [new NullSafeLetterCounter(new LetterCounterBase()),
                          new NullSafeLetterCounter(new LetterCounterRefinement1()),
                          new NullSafeLetterCounter(new LetterCounterRefinement2()),
                          new NullSafeLetterCounter(new LetterCounterRefinement3())]


    def "A LetterCounter can be created"() {
        expect:
        letterCounters.each {assert(it != null)}
    }

    @Unroll
    def "Check counted letters for #inputString"(String inputString, Map expectedResult) {
        expect:
        letterCounters.each {assert(it.countUsage(inputString) == expectedResult)}

        where:
        inputString | expectedResult
        ""          | [:]
        "a"         | [((char)'a'):1]
        "aa"        | [((char)'a'):2]
        "aab"       | [((char)'a'):2, ((char)'b'):1]
        "aabccc"    | [((char)'a'):2, ((char)'b'):1, ((char)'c'):3]
        "cabcac"    | [((char)'a'):2, ((char)'b'):1, ((char)'c'):3]
        null        | [:]
    }
}
