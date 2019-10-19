package com.zenika.katas.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.zenika.katas.fizzbuzz.TheStuffDoer.fizzbuzz;
import static org.assertj.core.api.Assertions.assertThat;


class FizzbuzzShould {

    @ParameterizedTest(name = "fizzbuzz({0}) should be \"FIZZ\"")
    @CsvSource({
            "3", "6", "9",
    })
    void threes(int number) {
        assertThat(fizzbuzz(number)).as("fizzbuzz(%d)", number)
                .isEqualTo("FIZZ");
    }

    @ParameterizedTest(name = "fizzbuzz({0}) should be \"BUZZ\"")
    @CsvSource({
            "5", "10", "20",
    })
    void fives(int number) {
        assertThat(fizzbuzz(number)).as("fizzbuzz(%d)", number)
                .isEqualTo("BUZZ");
    }

    @ParameterizedTest(name = "fizzbuzz({0}) should be \"QUUX\"")
    @CsvSource({
            "7", "14", "28",
    })
    void sevens(int number) {
        assertThat(fizzbuzz(number)).as("fizzbuzz(%d)", number)
                .isEqualTo("QUUX");
    }

    @ParameterizedTest(name = "fizzbuzz({0}) should be \"FIZZBUZZ\"")
    @CsvSource({
            "15", "30", "45",
    })
    void fifteens(int number) {
        assertThat(fizzbuzz(number)).as("fizzbuzz(%d)", number)
                .isEqualTo("FIZZBUZZ");
    }

    @ParameterizedTest(name = "fizzbuzz({0}) should be \"FIZZQUUX\"")
    @CsvSource({
            "21", "42",
    })
    void twentyones(int number) {
        assertThat(fizzbuzz(number)).as("fizzbuzz(%d)", number)
                .isEqualTo("FIZZQUUX");
    }

    @ParameterizedTest(name = "fizzbuzz({0}) should be \"BUZZQUUX\"")
    @CsvSource({
            "35", "70",
    })
    void thrityfives(int number) {
        assertThat(fizzbuzz(number)).as("fizzbuzz(%d)", number)
                .isEqualTo("BUZZQUUX");
    }

    @ParameterizedTest(name = "fizzbuzz({0}) should be \"BUZZQUUX\"")
    @CsvSource({
            "105", "210",
    })
    void hundredfives(int number) {
        assertThat(fizzbuzz(number)).as("fizzbuzz(%d)", number)
                .isEqualTo("FIZZBUZZQUUX");
    }

    @ParameterizedTest(name = "fizzbuzz({0}) should be \"{0}\"")
    @CsvSource({
            "1", "2", "4", "8"
    })
    void otherwise(int number) {
        assertThat(fizzbuzz(number)).as("fizzbuzz(%d)", number)
                .isEqualTo("%d", number);
    }
}
