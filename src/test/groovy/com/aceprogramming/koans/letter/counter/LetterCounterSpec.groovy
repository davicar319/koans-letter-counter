package com.aceprogramming.koans.letter.counter

import spock.lang.Specification
import spock.lang.Unroll


class LetterCounterSpec extends Specification {
    def letterCounter = new LetterCounter()

    def "A LetterCounter can be created"() {
        expect:
        letterCounter != null
    }

    @Unroll
    def "Check counted letters for #inputString"(String inputString, Map expectedResult) {
        expect:
        letterCounter.countUsage(inputString) == expectedResult

        where:
        inputString | expectedResult
        ""          | [:]
        "a"         | [((char)'a'):1]
        "aa"        | [((char)'a'):2]
        "aab"       | [((char)'a'):2, ((char)'b'):1]
        "aabccc"    | [((char)'a'):2, ((char)'b'):1, ((char)'c'):3]
        "cabcac"    | [((char)'a'):2, ((char)'b'):1, ((char)'c'):3]
    }
}
