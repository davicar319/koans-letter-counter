package com.aceprogramming.koans.letter.counter

import spock.lang.Specification


class LetterCounterSpec extends Specification {
    def letterCounter = new LetterCounter()

    def "test A LetterCounter can be created"() {
        expect:
        letterCounter != null
    }
}
