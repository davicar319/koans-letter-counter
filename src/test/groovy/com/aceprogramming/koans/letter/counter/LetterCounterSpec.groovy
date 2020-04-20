package com.aceprogramming.koans.letter.counter

import spock.lang.Specification


class LetterCounterSpec extends Specification {
    def letterCounter = new LetterCounter()

    def "A LetterCounter can be created"() {
        expect:
        letterCounter != null
    }

    def "Check counted letters for #inputString"(String inputString, Map expectedResult) {
        expect:
        letterCounter.countUsage(inputString) == expectedResult

        where:
        inputString | expectedResult
        ""          | [:]
    }
}
